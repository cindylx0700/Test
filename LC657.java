class LC657{
  public boolean judgeCircle(String moves) {

    int count= 0;
    int x =0;
    int y = 0;

    for(int i = 0; i< moves.length(); i++){
      char ch = moves.charAt(i);
      // if(ch == 'U'){
      //   count=count+2;
      // }else if(ch == 'D'){
      //   count=count-2;
      // }else if(ch == 'L'){
      //   count=count+2;
      // }else{
      //   count=count-2;
      // }


      if(ch == 'U'){
        y++;
      }else if(ch == 'D'){
        y--;
      }else if(ch == 'L'){
        x++;
      }else{
        x--;
      }

    }

    if( x==0 && y==0){
      return true;
    }else{
      return false;
    }

}

  public static void main(String[] args){
    String input = "LDRRLRUULR";
    LC657 c = new LC657();
    boolean result = c.judgeCircle(input);
    System.out.println(result);
  }
}
