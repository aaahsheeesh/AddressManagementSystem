package com.capgemini.go.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.capgemini.go.dto.AddressDTO;
import com.capgemini.go.service.AddressService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, AddressDTO> addressList = new HashMap<>();
		AddressDTO addressobj = new AddressDTO();
		AddressService obj = new AddressService();

		Scanner in = new Scanner(System.in);

		boolean y = true;
		do {
			System.out
					.print("----------------welocome to Addres managemnet system handled by Ashish----------------\n");
			System.out.println("1.viewAllAddress\n 2.addAddres \n 3.updateAddress \n 4.deleteAddress \n 5 exit");
			System.out.println("enter your choice");

			int day = in.nextInt();

			switch (day) {
			case 1:
				System.out.println("Case 1");

				addressList = obj.viewAllAddress();
				if (addressList != null) {
//					addressList.forEach((address) -> {
//						System.out.println(address);
//					});

					Iterator<Map.Entry<String, AddressDTO>> itr = addressList.entrySet().iterator();

					while (itr.hasNext()) {
						Entry<String, AddressDTO> entry = itr.next();
						System.out.println("Key = " + entry.getKey() + " " + entry.getValue());
					}

				} else {
					System.out.println("no address added");
				}
				break;
			case 2:
				System.out.println("Case 2");
				System.out.println(
						"please provide the required address fields," + " buildingno, city, state, field, zip");
				AddressDTO Addobj = new AddressDTO();
				System.out.println("please enter buildingno");
				Addobj.setBuildingNo(in.next());
				System.out.println("please enter city");
				Addobj.setCity(in.next());
				System.out.println("please enter state");
				Addobj.setState(in.next());
				System.out.println("please provide field");
				Addobj.setField(in.next());
				System.out.println("please provide zip");
				Addobj.setZip(in.next());
				obj.addAddress(Addobj);
				System.out.println("Address added");
				break;
			case 3:
				System.out.println("Case 3");
				// obj.updateAddress();

				break;
			case 4:
				System.out.println("Case 4");
				System.out.println("enter the key value you want to delete address for : ");
				String key = in.next();
				obj.deleteAddress(key);

				break;

			case 5:
				System.out.println("Case 5");
				// toexit();
				break;

			default:
				System.out.println("bad input");
				break;
			}
			System.out.println("want to process more? y/n");
			String x = in.next();
			char ch = x.charAt(0);
			if (ch == 'n')
				y = false;

		} while (y != false);
		in.close();

	}

}
