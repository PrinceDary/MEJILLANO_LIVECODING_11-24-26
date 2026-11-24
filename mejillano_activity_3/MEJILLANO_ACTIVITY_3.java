/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejillano_activity_3;

/**
 *
 * @author MEJILLANO_CPE113
 */
public class MEJILLANO_ACTIVITY_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two wallets
        CampusWallet margarette = new CampusWallet("Margarette", 100);
        CampusWallet francynne = new CampusWallet("Francynne");

        // Display starting balances
        System.out.println("=== CAMPUS WALLET TRANSFER ===");
        System.out.println("Starting Balances:");
        System.out.println("Margarette: " + margarette.getBalance());
        System.out.println("Francynne: " + francynne.getBalance());

        // Test 1: Transfer 35 credits
        System.out.println("\nTest 1: Margarette transfers 35 credits to Francynne.");
        System.out.println("Result: " + margarette.transferTo(francynne, 35));
        displayBalances(margarette, francynne);

        // Test 2: Transfer 70 credits
        System.out.println("\nTest 2: Margarette transfers 70 credits to Francynne.");
        System.out.println("Result: " + margarette.transferTo(francynne, 70));
        displayBalances(margarette, francynne);

        // Test 3: Transfer to own wallet
        System.out.println("\nTest 3: Margarette transfers 10 credits to herself.");
        System.out.println("Result: " + margarette.transferTo(margarette, 10));
        displayBalances(margarette, francynne);

        // Test 4: Francynne deposits 15 credits
        System.out.println("\nTest 4: Francynne deposits 15 credits.");
        System.out.println("Result: " + francynne.deposit(15));
        displayBalances(margarette, francynne);

        // Test 5: Transfer remaining 65 credits
        System.out.println("\nTest 5: Margarette transfers 65 credits to Francynne.");
        System.out.println("Result: " + margarette.transferTo(francynne, 65));
        displayBalances(margarette, francynne);

        // Test 6: Zero-credit transfer
        System.out.println("\nTest 6: Margarette transfers 0 credits to Francynne.");
        System.out.println("Result: " + margarette.transferTo(francynne, 0));
        displayBalances(margarette, francynne);

        // Test 7: Transfer to null
        System.out.println("\nTest 7: Margarette transfers 10 credits to null.");
        System.out.println("Result: " + margarette.transferTo(null, 10));
        displayBalances(margarette, francynne);
    }

    // Display wallet balances
    public static void displayBalances(CampusWallet wallet1, CampusWallet wallet2) {
        System.out.println("Margarette Balance: " + wallet1.getBalance());
        System.out.println("Francynne Balance: " + wallet2.getBalance());
    }
}