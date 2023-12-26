package carAccessories.fsec;
import carAccessories.first.*;


import java.util.Scanner;
import java.util.logging.Logger;

public class CarAccess {
    private static final Logger logger = Logger.getLogger(CarAccess.class.getName());


	public static void main(String[] args) {
		String msg=" what do you WANT to do?";
		String msg2="please Enter the # of the service";
		String msg3="please Enter the # of the product you wanna edit";
		String msg4="please Enter the # of user you wanna edit";
		String msg5="wrong #, TRY Again";
		String failMsg="***Failed, Try again***";
		String successMsg="***Success***";
		
	    do {
	    	Initialing.initialAccountsLL();
	    	Initialing.initialProductsAndCategories();
	
        logger.info("---Welcome to our Car Accessories center---");
        logger.info("press X to cancel");
	    logger.info("Hi, do you have an account? y/n");
	    
	    Scanner myObj = new Scanner(System.in);
	    String answer = myObj.nextLine();
	    int answerInt;
	    String Email;
	    String Password;
	    if(answer.equalsIgnoreCase("y")) {
	    	logger.info("Please enter your Email: ");
			Email= myObj.nextLine();
			
			logger.info("Please enter your Password: ");
			Password= myObj.nextLine();	
            boolean userInFlag=AuthenAndReg.checkUser(Email, Password);
            if(userInFlag) {
            User u=AuthenAndReg.getTypeUser(Email);
            logger.info("--------------------------------------------------------------");

            while(u.Type==1) {//admin
           int answerIntIn;
       	int answerIntInIn;

           String answerStringIn;
           answerInt=-1;
            logger.info("---Welcome Admin "+u.Name+msg);
            logger.info("1. Manage Categories");
            logger.info("2. Manage Products");
            logger.info("3. Manage User accounts");
            logger.info("4. logOut");
            logger.info(msg2);
             answerInt= myObj.nextInt();
            while(answerInt==1) {//manage categories
            	logger.info("---Managing Categories---");
                logger.info(msg);
                logger.info("1. Add Categorie");
                logger.info("2. Edit Categorie");
                logger.info("3. Delete Categorie");
                logger.info("4. Show Categories");
                logger.info("5. Back");
                logger.info(msg2);
                answerIntIn= myObj.nextInt();  
                  if(answerIntIn==1) {//Add Categorie
                	  myObj.nextLine(); 
                   	logger.info("---Adding Categorie---");
                   	
                    logger.info("Please enter the name of the NEW Categorie");
                   
                    answerStringIn=myObj.nextLine();
                    boolean done=((Admin) u).addCate(answerStringIn);
                    if(done) {
                        logger.info(successMsg);}
                        else {
                        	logger.info(failMsg);
                        }}
                  else     if(answerIntIn==2) {//Edit Categorie
                    	answerIntInIn=-1;

                       	logger.info("---Editing Categorie---");
                       	
                       	((Admin) u).showAllcategories();
                        logger.info("please Enter the # of the categorie you wanna edit");
                        answerIntInIn=myObj.nextInt();
                        logger.info("Please enter the NEW name of the Categorie");
                        myObj.nextLine(); 
                        answerStringIn=myObj.nextLine();
                        boolean done1=((Admin) u).editcatname(answerIntInIn,answerStringIn );
                        if(done1) {
                        logger.info(successMsg);}
                        else {
                        	logger.info(failMsg);
                        }
                        	}
                    else   if(answerIntIn==3) {//Delete Categorie
                    answerIntInIn=-1;
                      	logger.info("---Deleting Categorie---");
                      	myObj.nextLine(); 
                      	((Admin) u).showAllcategories();
                       logger.info("please Enter the # of the categorie you wanna delete");
                       answerIntInIn=myObj.nextInt();
                       boolean done1=((Admin) u).deletecateg(answerIntInIn);
                       if(done1) {
                       logger.info(successMsg);}
                       else {
                       	logger.info(failMsg);
                       }
                       	}
                   else  if(answerIntIn==4) {//show Categories
                     	logger.info("---Showing Categories---");
                     	((Admin) u).showAllcategories();
                      	}
                   if(answerIntIn==5) {//back to  admin dashboard
                    	break;
                     	}
                        
             
              
            }
            while(answerInt==2) {// manage products
            	answerIntIn=-1;
            	answerIntInIn=-1;
            logger.info("---Managing Products---");
            logger.info(msg);
            logger.info("1. Add Product");
            logger.info("2. Edit Product price");
            logger.info("3. Edit Product url");
            logger.info("4. Edit Product avilability");
            logger.info("5. Delete Product");
            logger.info("6. Show Products");
            logger.info("7. Back");
            logger.info(msg2);
            answerIntIn= myObj.nextInt();  
             if(answerIntIn==1) {//Add Product
               	logger.info("---Adding Product---");
                logger.info("Please enter the description of the NEW product");
                myObj.nextLine();
                String desc=myObj.nextLine();
                logger.info("Please enter the URL of the NEW product");
                myObj.nextLine();
                String url=myObj.nextLine();
                logger.info("Please enter the price of the NEW product");
 
                int price=myObj.nextInt();
                logger.info("Please enter the Type of the NEW product");
                myObj.nextLine();
                String Type=myObj.nextLine();
                logger.info("does it need installation y/N");
                
                String NI=myObj.nextLine();
                myObj.nextLine();
               boolean done=false;
                if(NI.equals("y")||NI.equals("Y")) {
                	
                	done=((Admin) u).addProd(desc, url, price, true, Type, true);
                   
                }else if(NI.equals("n")||NI.equals("N")) {
       
                	done=((Admin) u).addProd(desc, url, price, true, Type, false);
                  
                }
                else done=false;
                if(done) {
                    logger.info(successMsg);}
                    else {
                    	logger.info(failMsg);
                    }}
              
                
            else     if(answerIntIn==2) {//Edit product price
            	   myObj.nextLine();
            	   answerIntInIn=-1;
                   	logger.info("---Editing product price---");
                   	((Admin) u).showAllproducts();
                    logger.info(msg3);
                    answerIntInIn=myObj.nextInt();
                    logger.info("Please enter the NEW price of the product");
                    int priceIn=myObj.nextInt();
                    boolean done1=((Admin) u).editPrice(answerIntInIn, priceIn);
                    if(done1) {
                    logger.info(successMsg);}
                    else {
                    	logger.info(failMsg);
                    }
                    	}
               else   if(answerIntIn==3) {//edit product url 
            	   logger.info("---Editing product url---");
            	   answerIntInIn=-1;
            	   myObj.nextLine();
                  	((Admin) u).showAllproducts();
                   logger.info(msg3);
                   answerIntInIn=myObj.nextInt();
                   logger.info("Please enter the NEW url of the product");
                   myObj.nextLine();
                   answer=myObj.nextLine();
                   boolean done1=((Admin) u).editurl(answerIntInIn, answer);
                   if(done1) {
                   logger.info(successMsg);}
                   else {
                   	logger.info(failMsg);
                   }
                  	}
               else     if(answerIntIn==4) {//edit product avi
            	   logger.info("---Editing product Avialability---");
            	   answerIntInIn=-1;
                  	((Admin) u).showAllproducts();
                   logger.info(msg3);
                   answerIntInIn=myObj.nextInt();
                   boolean done1=((Admin) u).editavi(answerIntInIn);
                   if(done1) {
                   logger.info(successMsg);}
                   else {
                   	logger.info(failMsg);
                   }
                  	}
               else if(answerIntIn==5) {//Delete product
            	   answerIntInIn=-1;
            	   myObj.nextLine();
                  	logger.info("---Deleting Product---");
                  	((Admin) u).showAllproducts();
                   logger.info("please Enter the # of the product you wanna delete");
                   answerIntInIn=myObj.nextInt();
                   boolean done1=((Admin) u).delpro(answerIntInIn);
                   if(done1) {
                   logger.info(successMsg);}
                   else {
                   	logger.info(failMsg);
                   }
                   	}
               else if(answerIntIn==6) {//show products
                 	logger.info("---Showing Products---");
                 	((Admin) u).showAllproducts();
                  	}
               else if(answerIntIn==7) {//back to  admin dashboard
                	break;
                 	}
                    }
              
            
            while(answerInt==3) {// manage userAcc
            	myObj.nextLine();
            	answerIntIn=-1;
                logger.info("---Managing Users Accounts---");
                logger.info(msg);
                logger.info("1. Add User");
                logger.info("2. Edit USER Email");
                logger.info("3. Edit USER Password");
                logger.info("4. Edit USER Name");
                logger.info("5. Edit USER Phone");
                logger.info("6. Edit USER Address");
                logger.info("7. Edit USER Type");
                logger.info("8. Delete User");
                logger.info("9. Show Users");
                logger.info("10. Back");
                logger.info(msg2);
                answerIntIn= myObj.nextInt();  
                if(answerIntIn==1) {//Add User
                   	logger.info("---Adding User---");
                    logger.info("Please enter the Email of the NEW user");
                    myObj.nextLine();
                    String em=myObj.nextLine();
                    
                    logger.info("Please enter the Password of the NEW user");
                   
                    String pass=myObj.nextLine();
                    logger.info("Please enter the Name of the NEW user");
                   
                    String name=myObj.nextLine();
                    logger.info("Please enter the Phone of the NEW user");
                    
                    String phone=myObj.nextLine();
                    logger.info("Please enter the Address of the NEW user");
                    
                    String address=myObj.nextLine();
                    logger.info("what its type customer/admin/installer");
                    
                    String t=myObj.nextLine();
                    answerIntInIn=-1;
                    User a = null;
                   boolean done=false;
                    if(t.equalsIgnoreCase("customer")) {
                    	a=new Customer(em,pass,name,phone,address);
                    	a.Type=3;
                    	done=true;
                    	Initialing.accounts.add(a);
                       
                    }else if(t.equalsIgnoreCase("admin")) {
                    	a=new Admin(em,pass,name,phone,address);
                    	a.Type=1;
                    	done=true;
                    	Initialing.accounts.add(a);
                    }
                    else if(t.equalsIgnoreCase("installer")) {
                    	
                    	a=new Installer(em,pass,name,phone,address);
                    	a.Type=2;
                    	done=true;
                    	Initialing.accounts.add(a);
                    }
                    
                    if(done) {
                        logger.info(successMsg);}
                        else {
                        	logger.info(failMsg);
                        }}
                  
                    
                else if(answerIntIn==2) {//Edit user email
                	   
                       	logger.info("---Editing User Email---");
                       	myObj.nextLine();
                       	((Admin) u).showAllUsers();
                       	String oldEm=null;
                        logger.info(msg4);
                        answerIntIn=myObj.nextInt();
                        for(int i=0;i<Initialing.accounts.size();i++) {
                        	if(i==answerIntIn) {
                        		oldEm=Initialing.accounts.get(i).Email;
                        	}
                        }
                        logger.info("Please enter the NEW email of the user");
                        myObj.nextLine();
                        String newEm=myObj.nextLine();
                        boolean done1=((Admin) u).changeEmail(oldEm, newEm);
                        if(done1) {
                        logger.info(successMsg);}
                        else {
                        	logger.info(failMsg);
                        }
                        	}
                   else if(answerIntIn==3) {//edit user pass
                	   logger.info("---Editing User password---");
                	   myObj.nextLine();
                      	((Admin) u).showAllUsers();
                      	String Em=null;
                       logger.info(msg4);
                       answerIntIn=myObj.nextInt();
                       for(int i=0;i<Initialing.accounts.size();i++) {
                       	if(i==answerIntIn) {
                       		Em=Initialing.accounts.get(i).Email;
                       	}
                       }
                       logger.info("Please enter the NEW pass of the user");
                       myObj.nextLine();
                       String newPass=myObj.nextLine();
                       boolean done1=((Admin) u).changePass(Em, newPass);
                       if(done1) {
                       logger.info(successMsg);}
                       else {
                       	logger.info(failMsg);
                       }
                      	}
                   else if(answerIntIn==4) {//edit user name
                	   logger.info("---Editing User name---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      logger.info(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      logger.info("Please enter the NEW Name of the user");
                      myObj.nextLine();
                      String newName=myObj.nextLine();
                      boolean done1=((Admin) u).changeData(Em, newName,"","");
                      if(done1) {
                      logger.info(successMsg);}
                      else {
                      	logger.info(failMsg);
                      
                       }
                      	}
                   else if(answerIntIn==5) {//edit user PHONE
                	   logger.info("---Editing User PHONE---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      logger.info(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      logger.info("Please enter the NEW PHONE of the user");
                      myObj.nextLine();
                      String newP=myObj.nextLine();
                      boolean done1=((Admin) u).changeData(Em,"",newP,"");
                      if(done1) {
                      logger.info(successMsg);}
                      else {
                      	logger.info(failMsg);
                      
                       }
                      	}
                   else  if(answerIntIn==6) {//edit user Address
                	   logger.info("---Editing User Address---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      logger.info(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      logger.info("Please enter the NEW Address of the user");
                      myObj.nextLine();
                      String newAdd=myObj.nextLine();
                      boolean done1=((Admin) u).changeData(Em,"","",newAdd);
                      if(done1) {
                      logger.info(successMsg);}
                      else {
                      	logger.info(failMsg);
                      
                       }
                      	}
                   else  if(answerIntIn==7) {//edit user Type
                	   logger.info("---Editing User Address---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      logger.info(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      logger.info("what its type customer/admin/installer");
                      myObj.nextLine();
                      String t=myObj.nextLine();
                      boolean done=false;
                      int tt=-1;
                      if(t.equalsIgnoreCase("customer")) {
                      	tt=3;
                      }else if(t.equalsIgnoreCase("admin")) {
                    	tt=1;
                      }
                      else if(t.equalsIgnoreCase("installer")) {
                    	tt=2;
                      }
                      done=((Admin)u).changeType(Em, tt);
                      if(done) {
                      logger.info(successMsg);}
                      else {
                      	logger.info(failMsg);
                      
                       }
                      	}
                   else  if(answerIntIn==8) {//Delete User
                	   logger.info("---Deleting User---");
                	   myObj.nextLine();
                    	((Admin) u).showAllUsers();
                    	String Em=null;
                     logger.info(msg4);
                     answerIntIn=myObj.nextInt();
                     for(int i=0;i<Initialing.accounts.size();i++) {
                     	if(i==answerIntIn) {
                     		Em=Initialing.accounts.get(i).Email;
                     	}
                     }
                       boolean done1=((Admin) u).deleteUser(Em);
                       if(done1) {
                       logger.info(successMsg);}
                       else {
                       	logger.info(failMsg);
                       }
                       	}
                   else if(answerIntIn==9) {//show users
                     	logger.info("---Showing Users ---");
                     	((Admin) u).showAllUsers();
                      	}
                   else if(answerIntIn==10) {//back to  admin dashboard
                    	break;
                     	}
                        
            	
            }
            if(answerInt==4) {// log out
            	break;
            }
            else if(answerInt<1&&answerInt>4) {
            logger.info(msg5);	
            continue;	
            }
            }
            
            while(u.Type==3) { //customer
            	 int answerIntIn;
                	

                    String answerStringIn;
                    
                    answerInt=-1;
                     logger.info("---Welcome Custumer "+u.Name+msg);
                     logger.info("1. Browse products");
                     logger.info("2. Make purchases");
                     logger.info("3. view All orders");
                     logger.info("4. view my Installation");
                     logger.info("5. Edit Profile");
                     logger.info("6. logOut");
                     logger.info(msg2);
                      answerInt= myObj.nextInt();
                     if(answerInt==1) {//Browse products
                     	logger.info("---Browsing products---");
                        myObj.nextLine();  
                         logger.info("please Enter the description of the product you want");
                         answerStringIn= myObj.nextLine();       
                         boolean done=((Customer)u).searchProduct(answerStringIn);
                         if(done) {
                             logger.info("***this is the similar products***");}
                             else {
                             	logger.info("***Sorry this process falied,TRY AGAIN***");
                             }
                           }
                     else if(answerInt==2) {//Make purchases
                       	logger.info("---Make purchases---");
                       	myObj.nextLine(); 
                       	Product p;
                       	boolean done=false;
                        ((Customer)u).showAllproducts();
                        
                        logger.info("please Enter the # of product you wanna order");
                        answerIntIn=myObj.nextInt();
                        for(int i=0;i<Initialing.productsLL.size();i++) {
                        	if(answerIntIn==i) {
                        	p=Initialing.productsLL.get(i);
                        	if(!p.needInst) {
                            	done=((Customer)u).makeSimpleOrder(p);
                            	}
                            else {
                               logger.info("$This product need installation$");
                               myObj.nextLine(); 
                               logger.info("do you want us to afford you an installer? y/n");
                               logger.info("PS:this will plus 50 to the total price");
                               answerStringIn=myObj.nextLine();
                               if(answerStringIn.equalsIgnoreCase("y")) {
                            	   logger.info("Please enter your car MODEL");
                                   String model=myObj.nextLine();
                                   logger.info("Please enter Preferred date in this pattern yyyy-MM-dd HH:mm");
                                   String date=myObj.nextLine();
                                   done=((Customer)u).makeInstOrder(p, model, date);
                                   EmailSender.sendEmail(u.Email,"Car Accessouries: 1st Update","Your Order status[Pending]\n we are waiting for you to bring the car to Our Center");
                                   ///1st notification< {order status: pending--->the order is waiting for you to bring the car
                               }
                               else if(answerStringIn.equalsIgnoreCase("n")) {
                            	   done=((Customer)u).makeSimpleOrder(p);
                               }
                            }   
                        	}
                        }
                        
                        if(done) {
                        logger.info("***Success***");}
                        else {
                        	logger.info(failMsg);
                      }
                        }
                        
                    
                     else if(answerInt==3) {//View Orders
                      	logger.info("---Viewing All orders---");
                     
                          ((Customer)u).viewOrders();
                     }
                     else if(answerInt==4) {//View installations
                       	logger.info("---Viewing my Installations---");
                       	int i=0;
                      for(Installation c:((Customer)u).getMyInst()) {
                    	  logger.info(i+": "+c);
                    	  i++; }
                      }
                     
                     while(answerInt==5) {// managing my account
                     	myObj.nextLine();
                     	answerIntIn=-1;
                         logger.info("---Managing My Account---");
                         logger.info(msg);
      
                         logger.info("1. Show MY data");
                         logger.info("2. Edit MY Password");
                         logger.info("3. Edit MY Name");
                         logger.info("4. Edit MY Phone");
                         logger.info("5. Edit MY Address");
                         logger.info("6. Back");
                         logger.info(msg2);
                         answerIntIn= myObj.nextInt();  
                         if(answerIntIn==1) {//Show my Data
                            	logger.info("---Customer"+u.Name+"---");
                            	
                            	logger.info("---------------------------------\n");
                            	logger.info(u.toString());
                            	logger.info("---------------------------------\n");

                            	
                          }
                           
                         else if(answerIntIn==2) {//edit my pass
                         	   logger.info("---Editing User password---");
                         	   myObj.nextLine();
                         	  logger.info("Please enter your OLD pass");
                              
                              String oldPass=myObj.nextLine();
                              
                                logger.info("Please enter your NEW pass");
                               
                                String newPass=myObj.nextLine();
                                boolean done=((Customer) u).changeMyPass(oldPass, newPass);
                                if(done) {
                                logger.info(successMsg);}
                                else {
                                	logger.info(failMsg);
                                }
                               	}
                            else if(answerIntIn==3) {//edit my name
                         	   logger.info("---Editing my name---");
                         	   myObj.nextLine();
                              	
                               logger.info("Please enter your NEW Name ");
                               
                               String newName=myObj.nextLine();
                               boolean done1=((Customer) u).changeMyData( newName,"","");
                               if(done1) {
                               logger.info(successMsg);}
                               else {
                               	logger.info(failMsg);
                               
                                }
                               	}
                            else if(answerIntIn==4) {//edit user PHONE
                            	logger.info("---Editing my phone---");
                          	   myObj.nextLine();
                               	
                                logger.info("Please enter your NEW phone ");
                                
                                String newP=myObj.nextLine();
                                boolean done1=((Customer) u).changeMyData("",newP,"");
                                if(done1) {
                                logger.info(successMsg);}
                                else {
                                	logger.info(failMsg);
                                
                                 }
                               	}
                            else if(answerIntIn==5) {//edit my Address
                            	logger.info("---Editing my Address---");
                          	   myObj.nextLine();
                               	
                                logger.info("Please enter your NEW Address ");
                                myObj.nextLine();
                                String newAdd=myObj.nextLine();
                                boolean done1=((Customer) u).changeMyData( "","",newAdd);
                                if(done1) {
                                logger.info(successMsg);}
                                else {
                                	logger.info(failMsg);
                                
                                 }
                               	}
                           
                            else  if(answerIntIn==6) {//back to  admin dashboard
                             	break;
                              	}
                            
                     }
                     if(answerInt==6) {// log out
                     	break;
                     }
                     else if(answerInt<1&&answerInt>6) {
                     logger.info(msg5);	
                     continue;	
                     }
                     }
            while(u.Type==2) { // installer
            	 int answerIntIn;
             	

                 
                 
                 answerInt=-1;
                  logger.info("---Welcome Installer "+u.Name+msg);
                  logger.info("1. View installation requests");
                  logger.info("2. View my Own installation");
                  logger.info("3. make an appointment");
                  logger.info("4. Check as Done");
                  logger.info("5. logOut");
                  logger.info(msg2);
                   answerInt= myObj.nextInt();
                  if(answerInt==1) {//Viewing all Installation requests
                  	logger.info("---Viewing all INSTALLATIONs' requests---");
                     ((Installer)u).showAllInstallations();
                     for(Installation i:Initialing.installationRequests) {
                     EmailSender.sendEmail(i.custEmail,"Car Accessouries: 2nd Update","Your Order status[Waiting]\n we are waiting for you to bring the car to Our Center");

                     }
                     //2nd notification {Waiting-----> the installation is waiting an installer to take it
                        }
                  else if(answerInt==2) {//show my installation
                    	logger.info("---Show my INSTALLATIONs---");
                    	((Installer)u).showMyInstallations();
                     }
                     
                 
                  else if(answerInt==3) {//schedual appointment
                   	logger.info("---Let's schedual an appointment---");
                       ((Installer)u).showAllInstallations();
                     //2nd notification {Waiting-----> the installation is waiting an installer to take it
                       for(Installation i:Initialing.installationRequests) {
                           EmailSender.sendEmail(i.custEmail,"Car Accessouries:2nd Update","Your Order status[Waiting]\n we are waiting for you to bring the car to Our Center");

                           }
                     logger.info("This is all INSTALLATIONs available to take\n Please enter the # of the INSTALLATION you want to START work with");
                     answerIntIn=myObj.nextInt();
                     ((Installer)u).AddInstallationToWork(answerIntIn);
                     //3rd notification {In Process-----> the installation is In process
                     EmailSender.sendEmail(((Installer)u).myInstWork.get(answerIntIn).custEmail,"Car Accessouries: 3rd Update","Your Order status[In Process]\n Installer is WORKING on it");
                  }
                  else if(answerInt==4) {//check as done 
                		logger.info("---Let's schedual an appointment---");
                        ((Installer)u).showMyInstallations();
                      logger.info("This is all your INSTALLATIONs \n Please enter the # of the INSTALLATION you finished working with");
                      answerIntIn=myObj.nextInt();
                      ((Installer)u).changeStatustoDone(answerIntIn);
                      EmailSender.sendEmail(((Installer)u).myInstWork.get(answerIntIn).custEmail,"Car Accessouries: 4th Update","Your Order status [Done]\n Your car is done\nYou can come to take it");

                   }
                  
                 
                  else if(answerInt==5) {// log out
                  	break;
                  }
                  else if(answerInt<1&&answerInt>5) {
                  logger.info(msg5);	
                  continue;	
                  }
            	
            }
            
            if(u.Type!=1&&u.Type!=2&&u.Type!=3) {
            logger.info("Wrong email and Password,TRY AGAIN");
            continue;
            }
}
	    }
	    else if(answer.equalsIgnoreCase("n")){//new account
	    	int answerIntIn=-1;
	    	boolean done=false;
	    	 logger.info("You must be a new visitor please sign in to continue");
	    	 logger.info("1.Sign In");
	    	 logger.info("2.Cancel");
             answerIntIn= myObj.nextInt();  
             if(answerIntIn==1) {//Register
                	logger.info("---Sign In---");
                 logger.info("Please enter your Email");
                 myObj.nextLine();
                 String em=myObj.nextLine();
                 AuthenAndReg.checkUser(em, "");
                 if(AuthenAndReg.emailAv){
                	 done=true;}
                 
                 logger.info("Please enter your Password");
           
                 String pass=myObj.nextLine();
                 logger.info("Please enter your Name ");
                
                 String name=myObj.nextLine();
                 logger.info("Please enter your Phone ");
                 
                 String phone=myObj.nextLine();
                 logger.info("Please enter your Address");
                 
                 String address=myObj.nextLine();
         
               
                 if(done) {
                	 User a=new User(em,pass,name,phone,address);
                    a.Type=3;
                     logger.info("***Successfully Registered***");
                     logger.info("NOW,Please log In");
                 }
                     else {
                     	logger.info(failMsg);
                     }}
             else if(answerIntIn==2) {// cancel
                	 break;
                	 }
         
          
	    }
	    else if(answer.equalsIgnoreCase("x")){break;}
	    }while(true);


	}



}
