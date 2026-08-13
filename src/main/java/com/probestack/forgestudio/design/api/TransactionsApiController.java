package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateTransactionRequest;
import com.probestack.forgestudio.design.model.PointTransaction;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.TransactionsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")
@Controller
@RequestMapping("${openapi.loyaltyRewardsService.base-path:/loyalty/v1}")
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final TransactionsService transactionsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public TransactionsApiController(TransactionsService transactionsService, GeneratedRequestValidator generatedRequestValidator) {
        this.transactionsService = transactionsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<PointTransaction> createPointTransaction(@PathVariable() UUID memberId, @RequestBody() CreateTransactionRequest createTransactionRequest) {
        log.info("Processing createPointTransaction request");
        try {
            generatedRequestValidator.validate("createPointTransaction", createTransactionRequest);
            var response = transactionsService.createPointTransaction(memberId, createTransactionRequest);
            log.info("createPointTransaction completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createPointTransaction: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<PointTransaction>> listPointTransactions(@PathVariable() UUID memberId, @RequestParam() String type) {
        log.info("Processing listPointTransactions request");
        try {
            var response = transactionsService.listPointTransactions(memberId, type);
            log.info("listPointTransactions completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listPointTransactions: {}", e.getMessage(), e);
            throw e;
        }
    }
}
