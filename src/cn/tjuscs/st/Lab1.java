package cn.tjuscs.st;

public class Lab1 {

	public boolean calculate(int x) {
		if(x >= 50) {
			x -= 50;
		}
		if(x >= 20) {
			x -= 20;
		}
		if(x >= 10) {
			x -= 10;
		}
		if(x >= 5) {
			x -= 5;
		}
		for(int i = 0; i < 3; ++i) {
			if(x >= 1) {
				x -= 1;
			}
		}
		if(x == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
