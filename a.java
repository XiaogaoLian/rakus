public class a {
    public static void main(String[] args) {
 
        //1つ目 カンマ区切りで文字列を分解
        System.out.println("--1つ目--");
        String str = "9,,ren,おか,き,くけ,こ";
        String[] str2 = str.split(",");
        for(int i=0;i<str2.length;i++) {
            System.out.println(str2[i]);
        }
		if("".equals(str2[1])){
			System.out.println("miss");
		}
		if(str2[0].matches("[0-9]+")==true){
			System.out.println("true");
		}
		if(str2[2].matches("[a-z]+")==true){
			System.out.println("true");
		}
		
		String str3 = "ren,ren,10,9,1";
		String[] str4 = str3.split(",");
		
		int j=0;
        int[] num={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i=2; i<str4.length; i++) {
			
            num[j] = Integer.parseInt(str4[i]);
			System.out.println(num[j]);
			j++;
        }
		System.out.println(num[0]);
		
 
       
    }
}

int k=0;
		for(int i=18; i<36; i++){
			if(num[i]==0){
				hole2=i-18;
				break;
			}
			point2=point2+(num[i]-par[j]);
			k++;
			
		}