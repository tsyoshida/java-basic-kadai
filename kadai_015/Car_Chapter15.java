package kadai_015;

//車クラス
public class Car_Chapter15 {
	//フィールド
	//	1速から5速のギアを表す。初期ギア：1速
	private int gear = 1;
	//ギアチェンジ後の速度を表す　初期速度10km/h
	private int speed = 10;
	
	//メソッド
	// ギアチェンジメソッド
	public void gearChange(final int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました。");
        this.gear = afterGear;
		switch(afterGear) {
			case 1:this.speed = 10; break;
			case 2:this.speed = 20; break;
			case 3:this.speed = 30; break;
			case 4:this.speed = 40; break;
			case 5:this.speed = 50; break;
			default:this.speed = 10; break; // 1～5以外のギアは10km/h
		}
	}
	
	// 速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速"  + speed + "kmです");
	}
	
	
	
	}
