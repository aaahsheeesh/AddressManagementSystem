package com.capgemini.go.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.go.dto.AddressDTO;
import com.capgemini.go.service.AddressService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<AddressDTO> addressList = new ArrayList<AddressDTO>();
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
					addressList.forEach((address) -> {
						System.out.println(address);
					});
				}
				else
				{
					System.out.println("no address added");
				}
				break;
			case 2:
				System.out.println("Case 2");
				System.out.println("please provide the required address fields,"+ " buildingno, city, state, field, zip");

				System.out.println("please enter buildingno");
				addressobj.setBuildingNo(in.next());
				System.out.println("please enter city");
				addressobj.setCity(in.next());
				System.out.println("please enter state");
				addressobj.setState(in.next());
				System.out.println("please provide field");
				addressobj.setField(in.next());
				System.out.println("please provide zip");
				addressobj.setZip(in.next());
		
				obj.addAddress(addressobj);
				System.out.println("Address added");
				break;
			case 3:
				System.out.println("Case 3");
				// obj.updateAddress();
				break;
			case 4:
				System.out.println("Case 4");
				// obj.deleteAddress();
				
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
