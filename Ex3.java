class Ex3{

	public String ex3_0(int n){

        if(n>0) {
		return "その値は正です";
        }else {
          return "その値は０か負です";
        }

	}

	public int ex3_1(int n){

        if (n < 0 ){
        return n * -1;
        }else{

            return n;
        }


	}

	public String ex3_2(int a, int b){

	  if(a%b == 0) {
       return b + "は"  + a + "の約数です";
      }else{
          return  b + "は" + a +"の約数ではありません。";

      }

  }


	public String ex3_3(int a, int b){

        int max_num;

        if(a >= b){
          return  max_num == a;
        }else{
         return  max_num == b;
    }

    }

	public String ex3_4(int a){

		return "dummy";

	}

	public String ex3_5(int a){

		return "dummy";
	}

	public String ex3_6(int a){
		return "dummy";
	}

	public String ex3_7(int a){
		return "dummy";
	}

	public double ex3_8(double a, double b){
		return -1.0;
	}

	public int ex3_9(int a, int b){
		return 0;
	}

	public String ex3_10(int a, int b){
		return "dummy";
	}
}

