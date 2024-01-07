String fileName=trainsID+""+".txt";
          try{
              FileWriter fw = new FileWriter(fileName,true);
              fw.write(this.trainsID+" "+this.name+" "+this.age+" "+this.gender+" "+this.berthPreference+" "+this.type+" \n");
              fw.close();
          }catch (Exception e){
              System.out.println(e);
          }