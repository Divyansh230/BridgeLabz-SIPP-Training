package Smart_Warehouse_System;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 90000));
        electronicsStorage.addItem(new Electronics("Smartphone", 30000));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 1500));
        groceryStorage.addItem(new Groceries("Milk", 50));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2000));
        furnitureStorage.addItem(new Furniture("Table", 5000));

        System.out.println("All Electronics:");
        WarehouseUtils.displayUtils(electronicsStorage.getAllItems());

        System.out.println("\nAll Groceries:");
        WarehouseUtils.displayUtils(groceryStorage.getAllItems());

        System.out.println("\nAll Furniture:");
        WarehouseUtils.displayUtils(furnitureStorage.getAllItems());
    }
}
