String studentNumber = "32804063";
int lastSixDigits = Integer.parseInt(studentNumber.substring(studentNumber.length() - 6));
int vanillaPrice = lastSixDigits % 100;
int chocolatePrice = (lastSixDigits / 100) % 100;
int strawberryPrice = (lastSixDigits / 10000) % 100;
Scanner scanner = new Scanner(System.in);
System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String flavour = scanner.next();
if (!flavour.equalsIgnoreCase("v") && !flavour.equalsIgnoreCase("c") && !flavour.equalsIgnoreCase("s")) { 
    System.out.println("We don't have that flavour.");
    scanner.close(); 
} else {
    System.out.println("How many scoops would you like?");
    int scoops = scanner.nextInt();
    int basePrice = 100;
    int totalCost = 0;   
    if (scoops > 3) { 
        System.out.println("That's too many scoops to fit in a cone.");
} else if (scoops == 0) { 
        System.out.println("We don't sell just a cone.");
} else {
        switch (flavour.toLowerCase()) {
            case "v": 
                totalCost = basePrice + (vanillaPrice * scoops); 
                break;
            case "c": 
                totalCost = basePrice + (chocolatePrice * scoops); 
                break;
            case "s": 
                totalCost = basePrice + (strawberryPrice * scoops); 
                break;
    }
        int pounds = totalCost / 100; 
        int pence = totalCost % 100;
        System.out.println("That will be " + pounds + "." + String.format("%02d", pence) + " please.");
}
}