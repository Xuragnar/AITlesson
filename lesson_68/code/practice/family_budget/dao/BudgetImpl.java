package practice.family_budget.dao;

import lesson18.RubberArray;
import practice.family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget {

    List<Purchase> purchaseList;
    double budget;

    public BudgetImpl(List<Purchase> purchases, double budget) {
        this.purchaseList = new ArrayList<>();
        this.budget = budget;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {

        return purchaseList.add(purchase);
    }

    @Override
    public double calcBudget() {

        return purchaseList.stream()
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByPerson(String person) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getPerson().equals(person))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByStore(String store) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equals(store))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getDate().isAfter(from) && purchase.getDate().isBefore(to))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double addMoney(double money) {
        return budget + money;
    }

    @Override
    public boolean checkBudget(Purchase purchase) {
        return budget >= calcBudget();
    }

    @Override
    public double checkMoney(Purchase purchase) {
        return budget - calcBudget();
    }
}
