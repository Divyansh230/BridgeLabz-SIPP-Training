package Smart_Warehouse_System;
import java.util.*;
public class WarehouseUtils {
	public static void displayUtils(List<? extends WarehouseItem> list) {
		for(WarehouseItem i:list) {
			i.display();
		}
	}
}
