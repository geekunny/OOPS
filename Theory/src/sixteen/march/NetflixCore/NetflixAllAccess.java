package sixteen.march.NetflixCore;

public interface NetflixAllAccess extends NetflixEurope,NetflixUK,NetflixIndia{
	// one interface can extends many interfaces
	void billing();
}
