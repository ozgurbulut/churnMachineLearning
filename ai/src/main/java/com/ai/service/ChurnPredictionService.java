package com.ai.service;


import org.springframework.stereotype.Service;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;

import java.io.File;

@Service
public class ChurnPredictionService {

    private Classifier classifier;
    private Instances data;

    public ChurnPredictionService() throws Exception {
        String csvFilePath = "src/main/resources/customerChurn.csv";
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File(csvFilePath));
        data = loader.getDataSet();

        if (data.classIndex() == -1) {
            data.setClassIndex(data.numAttributes() - 1);
        }

        classifier = new J48();
        classifier.buildClassifier(data);
    }

    public String predictChurn(double[] attributes) throws Exception {

    	System.out.println("Number of attributes in dataset: " + data.numAttributes());
    	for (int i = 0; i < data.numAttributes(); i++) {
    	    System.out.println("Attribute " + i + ": " + data.attribute(i).name());
    	}

        Instance instance = new DenseInstance(1.0, attributes);
        instance.setDataset(data);
        
        double prediction = classifier.classifyInstance(instance);
        return data.classAttribute().value((int) prediction);
    }
}
