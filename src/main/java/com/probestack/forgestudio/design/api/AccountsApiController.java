package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.LoyaltyAccount;
import java.util.UUID;
import com.probestack.forgestudio.design.model.UpdateAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.AccountsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")
@Controller
@RequestMapping("${openapi.loyaltyRewardsService.base-path:/loyalty/v1}")
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final AccountsService accountsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public AccountsApiController(AccountsService accountsService, GeneratedRequestValidator generatedRequestValidator) {
        this.accountsService = accountsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<LoyaltyAccount> getLoyaltyAccount(@PathVariable() UUID memberId) {
        log.info("Processing getLoyaltyAccount request");
        try {
            var response = accountsService.getLoyaltyAccount(memberId);
            log.info("getLoyaltyAccount completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getLoyaltyAccount: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<LoyaltyAccount> updateLoyaltyAccount(@PathVariable() UUID memberId, @RequestBody() UpdateAccountRequest updateAccountRequest) {
        log.info("Processing updateLoyaltyAccount request");
        try {
            generatedRequestValidator.validate("updateLoyaltyAccount", updateAccountRequest);
            var response = accountsService.updateLoyaltyAccount(memberId, updateAccountRequest);
            log.info("updateLoyaltyAccount completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateLoyaltyAccount: {}", e.getMessage(), e);
            throw e;
        }
    }
}
