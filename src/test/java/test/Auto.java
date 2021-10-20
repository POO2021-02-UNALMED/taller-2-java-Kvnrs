
package test; 

public class Auto {
	/*
	     _,........_
               _.-'    ___    `-._
            ,-'      ,'   \       `.
 _,...    ,'      ,-'     |  ,""":`._.
/     `--+.   _,.'      _.',',|"|  ` \`
\_         `"'     _,-"'  | / `-'   l L\
  `"---.._      ,-"       | l       | | |
      /   `.   |          ' `.     ,' ; |
     j     |   |           `._`"""' ,'  |__
     |      `--'____          `----'    .' `.
     |    _,-"""    `-.                 |    \
     l   /             `.               F     l
      `./     __..._     `.           ,'      |
        |  ,-"      `.    | ._     _.'        |
        . j           \   j   /`"""      __   |          ,"`.
         `|           | _,.__ |        ,'  `. |          |   |
          `-._       /-'     `L       .     , '          |   |
              F-...-'          `      |    , /           |   |
              |            ,----.     `...' /            |   |
              .--.        j      l        ,'             |   j
             j    L       |      |'-...--<               .  /
             `     |       . __,,_    ..  |               \/
              `-..'.._  __,-'     \  |  |/`._           ,'`
                  |   ""       .--`. `--,  ,-`..____..,'   |
                   L          /     \ _.  |   | \  .-.\    j
                  .'._        l     .\    `---' |  |  || ,'
                   .  `..____,-.._.'  `._       |  `--;"I'
                    `--"' `.            ,`-..._/__,.-1,'
                            `-.__  __,.'     ,' ,' _-'
                                 `'...___..`'--^--' 
	*/
  
	String modelo;
	int precio;
	
	Asiento[] asientos;
	String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados;
    
    
    int cantidadAsientos() {
    	int c1 = 0;
    	for (int i = 0; i < asientos.length; i++) {
    		if (asientos[i] != null) {
    			c1++;
    		}
		}
    	return c1;
    }
    
    String verificarIntegridad(){
    	
    	int c1 = 0;
    	
    	for(int i = 0; i < asientos.length; i++) {
    		if(asientos[i]==null) {
    			
    			continue;
    			
    		}
   
    		else if(asientos[i].registro == (Auto.this.registro) && asientos[i].registro==(motor.registro)){
    			c1 = 0;
    		}
    		else {
    			c1 = 1;
    		
    		    break;
    		}
    	}
    	String c2 ="Auto original";
    	String c3 ="Las piezas no son originales";
    	if (c1 == 0) 
    		return c2;
    	else
    		return c3;
    			
    }
}


