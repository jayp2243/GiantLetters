
public class GiantLetters {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Please enter a word:  ");
String input = scan.nextLine();
//Turns user input into lowercase 
input = input.toLowerCase();
//Stores each letter of user input into char array
String [] chars = input.split("");

//2D Array of Alphabet
String [][] alpha = {

{"######",   
 "#    #",   
 "######",   
 "#    #",
 "#    #"  
},

{"######",
 "#    #",
 "######",
 "#    #",
 "######"
 },
 
{"######",
 "#",
 "#",
 "#",
 "######"
},
 
{"##### ",
"#    #",
"#    #",
"#    #",
 "##### "
	},  		 

{"######",
 "#      ",
 "######",
 "#     ",
 "######"
 },
	 
{"######",
 "#      ",
 "######",
 "#     ",
 "#"
	 },
	 
{"######",
 "#",
 "######",
 "#    #",
 "######"},
 
{"#    #",
 "#    #",
 "######",
 "#    #",
 "#    #"
 },
 
 {"######",
 "   #",
 "   #",
 "   #",
 "######"
},

 {"######",
 "   #",
 "   #",
 "   #",
 "####   "
},


{"#   #",   
 "# #",   
 "## ",   
 "# #",
 "#   #"  
},

{"# ",
 "#",
 "#",
 "#    ",
 "######"
 },
 
{"##  ##",
 "##  ##",
 "# ## #",
 "# ## #",
 "# #  #"
 },
 
{"##   #",
 "# #  #",
 "#  # #",
 "#   ##",
 "#    #"
},

{" ####",
 "#    #",
 "#    #",
 "#    #",
 " ####"},

 
{"######",
 "#    #",
 "######",
 "#     ",
 "#     "
 },

{" ####",
 "#    #",
 "# #  #",
 " ###",
 "   # "},
 
{ "######",
  "#    #",
  "#####",
  "#   #",
 "##  ##"
 },
 
{"######",
 "#     ",
 "######",
 "     #",
 "######"
 },
 
 {"######",
 "   #",
 "   #",
 "   #",
 "   #"
},

{
" #    #",
 "#    #",
 "#    #",
 "#    #",
 " ####"},
 
{"#    #",
 "#    #",
 "#    #",
 " #  #",
 "  #"   },
 
{"#    #",
 "#    #",
 "#  # #",
 "# ## #",
 "##  ##"
 },
 
{"#    #",
 " #  # ",
 "  ##  ",
 "  ##",
 "#    #"
 },
 
{"#    #",
 " #  # ",
 "  ##  ",
 "  #",
 "  # "
},

{  "######",
  "    #",
  "   #",
  "  #",
   "######"
	 },

};

//Scans user input and prints each letter entered

for(int j=0; j<chars.length; j++){

if(chars[j].equals("a")) {
for(int k=0; k<5; k++){
	System.out.println(alpha[0][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("b")) {
for(int k=0; k<5; k++){
	System.out.println(alpha[1][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("c")){
for(int k=0; k<5; k++){
	System.out.println(alpha[2][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("d")){
for(int k=0; k<5; k++){
	System.out.println(alpha[3][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("e")){
for(int k=0; k<5; k++){
	System.out.println(alpha[4][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("f")){
for(int k=0; k<5; k++){
	System.out.println(alpha[5][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("g")){
for(int k=0; k<5; k++){
	System.out.println(alpha[6][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("h")){
for(int k=0; k<5; k++){
	System.out.println(alpha[7][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("i")){
for(int k=0; k<5; k++){
	System.out.println(alpha[8][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}



if(chars[j].equals("j")){
for(int k=0; k<5; k++){
	System.out.println(alpha[9][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("k")){
for(int k=0; k<5; k++){
	System.out.println(alpha[10][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("l")){
for(int k=0; k<5; k++){
	System.out.println(alpha[11][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
}

if(chars[j].equals("m")){
for(int k=0; k<5; k++){
	System.out.println(alpha[12][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");

}

if(chars[j].equals("n")){
for(int k=0; k<5; k++){
	System.out.println(alpha[13][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");

}

if(chars[j].equals("o")){
for(int k=0; k<5; k++){
	System.out.println(alpha[14][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
	
}

if(chars[j].equals("p")){
for(int k=0; k<5; k++){
	System.out.println(alpha[15][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");



}

if(chars[j].equals("q")){
for(int k=0; k<5; k++){
	System.out.println(alpha[16][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("r")){
for(int k=0; k<5; k++){
	System.out.println(alpha[17][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("s")){
for(int k=0; k<5; k++){
	System.out.println(alpha[18][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("t")){
for(int k=0; k<5; k++){
	System.out.println(alpha[19][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("u")){
for(int k=0; k<5; k++){
	System.out.println(alpha[20][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("v")){
for(int k=0; k<5; k++){
	System.out.println(alpha[21][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("w")){
for(int k=0; k<5; k++){
	System.out.println(alpha[22][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("x")){
for(int k=0; k<5; k++){
	System.out.println(alpha[23][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("y")){
for(int k=0; k<5; k++){
	System.out.println(alpha[24][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}

if(chars[j].equals("z")){
for(int k=0; k<5; k++){
	System.out.println(alpha[25][k]);
    
    
	}
	System.out.println("  ");
	System.out.println(" ");
	
}
}
}
}

