package com.ai.util;

import com.ai.model.Customer;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderUtil {

    public List<Customer> readCustomerData(String filePath) {
        List<Customer> customers = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = csvReader.readAll();
            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                Customer customer = new Customer();
                customer.setState(record[0]);
                customer.setAccountLength(Integer.parseInt(record[1]));
                customer.setAreaCode(Integer.parseInt(record[2]));
                customer.setPhone(record[3]);
                customer.setIntlPlan(record[4].equalsIgnoreCase("yes"));
                customer.setVmailPlan(record[5].equalsIgnoreCase("yes"));
                customer.setVmailMessage(Integer.parseInt(record[6]));
                customer.setDayMins(Double.parseDouble(record[7]));
                customer.setDayCalls(Integer.parseInt(record[8]));
                customer.setDayCharge(Double.parseDouble(record[9]));
                customer.setEveMins(Double.parseDouble(record[10]));
                customer.setEveCalls(Integer.parseInt(record[11]));
                customer.setEveCharge(Double.parseDouble(record[12]));
                customer.setNightMins(Double.parseDouble(record[13]));
                customer.setNightCalls(Integer.parseInt(record[14]));
                customer.setNightCharge(Double.parseDouble(record[15]));
                customer.setIntlMins(Double.parseDouble(record[16]));
                customer.setIntlCalls(Integer.parseInt(record[17]));
                customer.setIntlCharge(Double.parseDouble(record[18]));
                customer.setCustServCalls(Integer.parseInt(record[19]));
                customer.setChurn(record[20].equalsIgnoreCase("True"));
                customers.add(customer);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return customers;
    }
}
