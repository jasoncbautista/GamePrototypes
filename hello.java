void setup(){
	size(480, 120);
}



void draw(){
	if(mousePresesd){
		fill(0);
	} else {
		fill(255);
	}


	elipse(mouseX, mouseY, 80,80);

}
