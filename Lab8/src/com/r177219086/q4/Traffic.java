package com.r177219086.q4;

import java.util.Scanner;

public class Traffic {
	int car1;
	int car2;
	
	public static void main(String[] args) throws CollisionException {
		// TODO Auto-generated method stub
		Traffic cars=new Traffic();
		Scanner sc=new Scanner(System.in);
		System.out.println("Same direction - Both postive or Both negative");
		System.out.println("Different Direction - One postiive and One negative");
		System.out.print("Car-1: ");
		cars.car1=sc.nextInt();
		System.out.print("Car-2: ");
		cars.car2=sc.nextInt();
		if((cars.car1<0 && cars.car2>0)||(cars.car1>0 && cars.car2<0)) {
			throw new CollisionException("There are chances of collision");
		}
		else
			System.out.println("No chances of Collisions.");
	}

}
