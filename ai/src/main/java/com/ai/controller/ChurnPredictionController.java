package com.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ai.dto.AttributeRequest;
import com.ai.service.ChurnPredictionService;

@RestController
@RequestMapping("/api/churn")
public class ChurnPredictionController {

    private final ChurnPredictionService churnPredictionService;

    @Autowired
    public ChurnPredictionController(ChurnPredictionService churnPredictionService) {
        this.churnPredictionService = churnPredictionService;
    }

    @PostMapping("/predict")
    public ResponseEntity<String> predictChurn(@RequestBody AttributeRequest request) {
        try {
            double[] attributes = request.getAttributes();
            
            String prediction = churnPredictionService.predictChurn(attributes);
            return ResponseEntity.ok(prediction);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Tahmin yaparken bir hata oluştu: " + e.getMessage());
        }
    }
    
}