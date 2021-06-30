package com.bootcamp.exercises.classone.productsale;

import java.util.Scanner;

public class PurchaseService {


    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        comprar(purchase);

    }

    public static void comprar(Purchase purchase) {
        int opcao = 0;

        Product [] products = new Product().getListProducts();

        while(opcao != 4) {


            for (int i = 0; i < products.length; i++) {
                System.out.println(String.format("%d - %s - %.2f", products[i].getId(), products[i].getName(), products[i].getPrice()));

            }

            System.out.println(String.format("4 - %s", "Finalizar compra"));

            System.out.println("\nSelecione o seu produto ou finalize a compra: ");

            Scanner input = new Scanner(System.in);

            opcao = input.nextInt();

            if (opcao != 4) {
                System.out.println("\n Digite a quantidade: ");
                int quantity = input.nextInt();

                SelectedProduct selectedProduct = new SelectedProduct();
                selectedProduct.setProduct(products[opcao]);
                selectedProduct.setQuantity(quantity);

                purchase.addProduct(selectedProduct);
            }
        }

        finalizarCompra(purchase);

    }


    public static void finalizarCompra(Purchase purchase) {

        for (int i = 0; i < purchase.getProducts().length; i++) {

            if (purchase.getProducts()[i] != null) {
                System.out.println(String.format("Produto: %s - Preco: %.2f - Quantidade: %d", purchase.getProducts()[i].getProduct().getName(),
                        purchase.getProducts()[i].getProduct().getPrice(), purchase.getProducts()[i].getQuantity()));
            }else{
                break;
            }
        }

        System.out.println("Valor total: " + purchase.getAmount());
    }

}
