package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.RedeemRewardRequest;
import com.probestack.forgestudio.design.model.Redemption;
import com.probestack.forgestudio.design.model.Reward;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.probestack.forgestudio.design.service.RewardsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-13T10:36:55.986768776Z[GMT]")
@Controller
@RequestMapping("${openapi.loyaltyRewardsService.base-path:/loyalty/v1}")
public class RewardsApiController implements RewardsApi {

    private static final Logger log = LoggerFactory.getLogger(RewardsApiController.class);

    private final RewardsService rewardsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public RewardsApiController(RewardsService rewardsService, GeneratedRequestValidator generatedRequestValidator) {
        this.rewardsService = rewardsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<List<Reward>> listRewards(@RequestParam() UUID affordableForMemberId) {
        log.info("Processing listRewards request");
        try {
            var response = rewardsService.listRewards(affordableForMemberId);
            log.info("listRewards completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listRewards: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Redemption> redeemReward(@PathVariable() UUID rewardId, @RequestBody() RedeemRewardRequest redeemRewardRequest) {
        log.info("Processing redeemReward request");
        try {
            generatedRequestValidator.validate("redeemReward", redeemRewardRequest);
            var response = rewardsService.redeemReward(rewardId, redeemRewardRequest);
            log.info("redeemReward completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process redeemReward: {}", e.getMessage(), e);
            throw e;
        }
    }
}
