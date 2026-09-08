package com.joysistvi.stage1.day13;

public class Main {
//class have Single Responsibility
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.brand = "HP";
        laptop.color = "Black";
        laptop.ramInGb = 12;
        laptop.weightInkg = 1.2;
        laptop.cpu = "i5";

        laptop.playGames();
        laptop.sendEmail();
        laptop.writeCodes();
        laptop.watchTutorial();

        Laptop laptop2 = new Laptop();
        laptop2.brand = "MSI";
        laptop2.color = "Green";
        laptop2.ramInGb = 19;
        laptop2.weightInkg = 1.2;
        laptop2.cpu = "Ryzen5";

        laptop2.playGames();
        laptop2.writeCodes();
        laptop2.watchTutorial();
        laptop2.sendEmail();
        laptop2.learnAI();

        Laptop laptop3 = new Laptop();
        laptop3.brand = "Lenovo";
        laptop3.color = "Red";
        laptop3.ramInGb = 20;
        laptop3.weightInkg = 1.2;
        laptop3.cpu = "i7";

        laptop3.playGames();
        laptop3.writeCodes();
        laptop3.watchTutorial();

    }
}
