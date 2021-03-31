package sixteen.march.NetflixCore;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Netflix obj=new Netflix();
//		obj.indiaContent(); This should not be like this, otherwise with single subscription user will be able to 
//		obj.indiaContent(); watch all three country content which we don't want.
//		obj.ukContent(); Thats why, see below
		NetflixIndia india=obj;    // OR NeflixIndia india = new Netflix();
		NetflixUK uk=obj;
		NetflixEurope europe=obj;
		india.indiaContent();
		uk.ukContent();
		europe.europeContent();
		obj.billing();
		System.out.println(obj instanceof NetflixEurope);
		System.out.println(obj instanceof NetflixUK);
		System.out.println(obj.plan);
		System.out.println(india.plan);
//		obj.plan=2000; // can not change the value bcz the variable defined in an interface will always be static final
						// whether you write or not
	}

}
