class GussingGame{
public int answer;
public int min;
public int max;
public GussingGame(int min,int max){
this.min=min;
this.max=max;
}
public int guess(){
this.answer=(this.min+this.max)/2;
return this.answer;
}
public void lower(){
this.max=this.answer-1;
}
public void higher(){
this.min=this.answer+1;
}
}