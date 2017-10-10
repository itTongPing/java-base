import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Test {
	
	
		public static void main(String[] args) {
			StringTokenizer tokenizer=new StringTokenizer("a,b,c", ",");
			
			String[] array=new String[tokenizer.countTokens()];
			
			int i=0;
			while(tokenizer.hasMoreElements()){
				array[i++]=tokenizer.nextToken();
			}
			
			//将数组转成List对象
			List<String> asList = Arrays.asList(array);
			
			System.out.println(asList);
			
			
		}

}
