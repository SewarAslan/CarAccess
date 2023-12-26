package carAccessories.fsec;
import carAccessories.first.*;
import java.util.LinkedList;
import java.util.Scanner;

public class carAccess {


	public static void main(String[] args) {
		String msg=" what do you WANT to do?";
		String msg2="please Enter the # of the service";
		String msg3="please Enter the # of the product you wanna edit";
		String msg4="please Enter the # of user you wanna edit";
		String msg5="wrong #, TRY Again";
		String failMsg="***Failed, Try again***";
		String SuccessMsg="***Success***";
		
	    do {
	    	Initialing.initialAccountsLL();
	    	Initialing.initialProductsAndCategories();
	
        System.out.println("---Welcome to our Car Accessories center---");
        System.out.println("press X to cancel");
	    System.out.println("Hi, do you have an account? y/n");
	    
	    Scanner myObj = new Scanner(System.in);
	    String answer = myObj.nextLine();
	    int answerInt;
	    String Email;
	    String Password;
	    if(answer.equalsIgnoreCase("y")) {
	    	System.out.println("Please enter your Email: ");
			Email= myObj.nextLine();
			
			System.out.println("Please enter your Password: ");
			Password= myObj.nextLine();	
            boolean userInFlag=AuthenAndReg.checkUser(Email, Password);
            if(userInFlag) {
            User u=AuthenAndReg.getTypeUser(Email);
            System.out.println("--------------------------------------------------------------");

            while(u.Type==1) {//admin
           int answerIntIn;
       	int answerIntInIn;

           String answerStringIn;
           answerInt=-1;
            System.out.println("---Welcome Admin "+u.Name+msg);
            System.out.println("1. Manage Categories");
            System.out.println("2. Manage Products");
            System.out.println("3. Manage User accounts");
            System.out.println("4. logOut");
            System.out.println(msg2);
             answerInt= myObj.nextInt();
            while(answerInt==1) {//manage categories
            	System.out.println("---Managing Categories---");
                System.out.println(msg);
                System.out.println("1. Add Categorie");
                System.out.println("2. Edit Categorie");
                System.out.println("3. Delete Categorie");
                System.out.println("4. Show Categories");
                System.out.println("5. Back");
                System.out.println(msg2);
                answerIntIn= myObj.nextInt();  
                  if(answerIntIn==1) {//Add Categorie
                	  myObj.nextLine(); 
                   	System.out.println("---Adding Categorie---");
                   	
                    System.out.println("Please enter the name of the NEW Categorie");
                   
                    answerStringIn=myObj.nextLine();
                    boolean done=((Admin) u).addCate(answerStringIn);
                    if(done) {
                        System.out.println(SuccessMsg);}
                        else {
                        	System.out.println(failMsg);
                        }}
                  else     if(answerIntIn==2) {//Edit Categorie
                    	answerIntInIn=-1;

                       	System.out.println("---Editing Categorie---");
                       	
                       	((Admin) u).showAllcategories();
                        System.out.println("please Enter the # of the categorie you wanna edit");
                        answerIntInIn=myObj.nextInt();
                        System.out.println("Please enter the NEW name of the Categorie");
                        myObj.nextLine(); 
                        answerStringIn=myObj.nextLine();
                        boolean done1=((Admin) u).editcatname(answerIntInIn,answerStringIn );
                        if(done1) {
                        System.out.println(SuccessMsg);}
                        else {
                        	System.out.println(failMsg);
                        }
                        	}
                    else   if(answerIntIn==3) {//Delete Categorie
                    answerIntInIn=-1;
                      	System.out.println("---Deleting Categorie---");
                      	myObj.nextLine(); 
                      	((Admin) u).showAllcategories();
                       System.out.println("please Enter the # of the categorie you wanna delete");
                       answerIntInIn=myObj.nextInt();
                       boolean done1=((Admin) u).deletecateg(answerIntInIn);
                       if(done1) {
                       System.out.println(SuccessMsg);}
                       else {
                       	System.out.println(failMsg);
                       }
                       	}
                   else  if(answerIntIn==4) {//show Categories
                     	System.out.println("---Showing Categories---");
                     	((Admin) u).showAllcategories();
                      	}
                   if(answerIntIn==5) {//back to  admin dashboard
                    	break;
                     	}
                        
             
              
            }
            while(answerInt==2) {// manage products
            	answerIntIn=-1;
            	answerIntInIn=-1;
            System.out.println("---Managing Products---");
            System.out.println(msg);
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product price");
            System.out.println("3. Edit Product url");
            System.out.println("4. Edit Product avilability");
            System.out.println("5. Delete Product");
            System.out.println("6. Show Products");
            System.out.println("7. Back");
            System.out.println(msg2);
            answerIntIn= myObj.nextInt();  
             if(answerIntIn==1) {//Add Product
               	System.out.println("---Adding Product---");
                System.out.println("Please enter the description of the NEW product");
                myObj.nextLine();
                String desc=myObj.nextLine();
                System.out.println("Please enter the URL of the NEW product");
                myObj.nextLine();
                String url=myObj.nextLine();
                System.out.println("Please enter the price of the NEW product");
 
                int price=myObj.nextInt();
                System.out.println("Please enter the Type of the NEW product");
                myObj.nextLine();
                String Type=myObj.nextLine();
                System.out.println("does it need installation y/N");
                
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
                    System.out.println(SuccessMsg);}
                    else {
                    	System.out.println(failMsg);
                    }}
              
                
            else     if(answerIntIn==2) {//Edit product price
            	   myObj.nextLine();
            	   answerIntInIn=-1;
                   	System.out.println("---Editing product price---");
                   	((Admin) u).showAllproducts();
                    System.out.println(msg3);
                    answerIntInIn=myObj.nextInt();
                    System.out.println("Please enter the NEW price of the product");
                    int priceIn=myObj.nextInt();
                    boolean done1=((Admin) u).editPrice(answerIntInIn, priceIn);
                    if(done1) {
                    System.out.println(SuccessMsg);}
                    else {
                    	System.out.println(failMsg);
                    }
                    	}
               else   if(answerIntIn==3) {//edit product url 
            	   System.out.println("---Editing product url---");
            	   answerIntInIn=-1;
            	   myObj.nextLine();
                  	((Admin) u).showAllproducts();
                   System.out.println(msg3);
                   answerIntInIn=myObj.nextInt();
                   System.out.println("Please enter the NEW url of the product");
                   myObj.nextLine();
                   answer=myObj.nextLine();
                   boolean done1=((Admin) u).editurl(answerIntInIn, answer);
                   if(done1) {
                   System.out.println(SuccessMsg);}
                   else {
                   	System.out.println(failMsg);
                   }
                  	}
               else     if(answerIntIn==4) {//edit product avi
            	   System.out.println("---Editing product Avialability---");
            	   answerIntInIn=-1;
                  	((Admin) u).showAllproducts();
                   System.out.println(msg3);
                   answerIntInIn=myObj.nextInt();
                   boolean done1=((Admin) u).editavi(answerIntInIn);
                   if(done1) {
                   System.out.println(SuccessMsg);}
                   else {
                   	System.out.println(failMsg);
                   }
                  	}
               else if(answerIntIn==5) {//Delete product
            	   answerIntInIn=-1;
            	   myObj.nextLine();
                  	System.out.println("---Deleting Product---");
                  	((Admin) u).showAllproducts();
                   System.out.println("please Enter the # of the product you wanna delete");
                   answerIntInIn=myObj.nextInt();
                   boolean done1=((Admin) u).delpro(answerIntInIn);
                   if(done1) {
                   System.out.println(SuccessMsg);}
                   else {
                   	System.out.println(failMsg);
                   }
                   	}
               else if(answerIntIn==6) {//show products
                 	System.out.println("---Showing Products---");
                 	((Admin) u).showAllproducts();
                  	}
               else if(answerIntIn==7) {//back to  admin dashboard
                	break;
                 	}
                    }
              
            
            while(answerInt==3) {// manage userAcc
            	myObj.nextLine();
            	answerIntIn=-1;
                System.out.println("---Managing Users Accounts---");
                System.out.println(msg);
                System.out.println("1. Add User");
                System.out.println("2. Edit USER Email");
                System.out.println("3. Edit USER Password");
                System.out.println("4. Edit USER Name");
                System.out.println("5. Edit USER Phone");
                System.out.println("6. Edit USER Address");
                System.out.println("7. Edit USER Type");
                System.out.println("8. Delete User");
                System.out.println("9. Show Users");
                System.out.println("10. Back");
                System.out.println(msg2);
                answerIntIn= myObj.nextInt();  
                if(answerIntIn==1) {//Add User
                   	System.out.println("---Adding User---");
                    System.out.println("Please enter the Email of the NEW user");
                    myObj.nextLine();
                    String em=myObj.nextLine();
                    
                    System.out.println("Please enter the Password of the NEW user");
                   
                    String pass=myObj.nextLine();
                    System.out.println("Please enter the Name of the NEW user");
                   
                    String name=myObj.nextLine();
                    System.out.println("Please enter the Phone of the NEW user");
                    
                    String phone=myObj.nextLine();
                    System.out.println("Please enter the Address of the NEW user");
                    
                    String address=myObj.nextLine();
                    System.out.println("what its type customer/admin/installer");
                    
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
                        System.out.println(SuccessMsg);}
                        else {
                        	System.out.println(failMsg);
                        }}
                  
                    
                else if(answerIntIn==2) {//Edit user email
                	   
                       	System.out.println("---Editing User Email---");
                       	myObj.nextLine();
                       	((Admin) u).showAllUsers();
                       	String oldEm=null;
                        System.out.println(msg4);
                        answerIntIn=myObj.nextInt();
                        for(int i=0;i<Initialing.accounts.size();i++) {
                        	if(i==answerIntIn) {
                        		oldEm=Initialing.accounts.get(i).Email;
                        	}
                        }
                        System.out.println("Please enter the NEW email of the user");
                        myObj.nextLine();
                        String newEm=myObj.nextLine();
                        boolean done1=((Admin) u).changeEmail(oldEm, newEm);
                        if(done1) {
                        System.out.println(SuccessMsg);}
                        else {
                        	System.out.println(failMsg);
                        }
                        	}
                   else if(answerIntIn==3) {//edit user pass
                	   System.out.println("---Editing User password---");
                	   myObj.nextLine();
                      	((Admin) u).showAllUsers();
                      	String Em=null;
                       System.out.println(msg4);
                       answerIntIn=myObj.nextInt();
                       for(int i=0;i<Initialing.accounts.size();i++) {
                       	if(i==answerIntIn) {
                       		Em=Initialing.accounts.get(i).Email;
                       	}
                       }
                       System.out.println("Please enter the NEW pass of the user");
                       myObj.nextLine();
                       String newPass=myObj.nextLine();
                       boolean done1=((Admin) u).changePass(Em, newPass);
                       if(done1) {
                       System.out.println(SuccessMsg);}
                       else {
                       	System.out.println(failMsg);
                       }
                      	}
                   else if(answerIntIn==4) {//edit user name
                	   System.out.println("---Editing User name---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      System.out.println(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      System.out.println("Please enter the NEW Name of the user");
                      myObj.nextLine();
                      String newName=myObj.nextLine();
                      boolean done1=((Admin) u).changeData(Em, newName,"","");
                      if(done1) {
                      System.out.println(SuccessMsg);}
                      else {
                      	System.out.println(failMsg);
                      
                       }
                      	}
                   else if(answerIntIn==5) {//edit user PHONE
                	   System.out.println("---Editing User PHONE---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      System.out.println(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      System.out.println("Please enter the NEW PHONE of the user");
                      myObj.nextLine();
                      String newP=myObj.nextLine();
                      boolean done1=((Admin) u).changeData(Em,"",newP,"");
                      if(done1) {
                      System.out.println(SuccessMsg);}
                      else {
                      	System.out.println(failMsg);
                      
                       }
                      	}
                   else  if(answerIntIn==6) {//edit user Address
                	   System.out.println("---Editing User Address---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      System.out.println(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      System.out.println("Please enter the NEW Address of the user");
                      myObj.nextLine();
                      String newAdd=myObj.nextLine();
                      boolean done1=((Admin) u).changeData(Em,"","",newAdd);
                      if(done1) {
                      System.out.println(SuccessMsg);}
                      else {
                      	System.out.println(failMsg);
                      
                       }
                      	}
                   else  if(answerIntIn==7) {//edit user Type
                	   System.out.println("---Editing User Address---");
                	   myObj.nextLine();
                     	((Admin) u).showAllUsers();
                     	String Em=null;
                      System.out.println(msg4);
                      answerIntIn=myObj.nextInt();
                      for(int i=0;i<Initialing.accounts.size();i++) {
                      	if(i==answerIntIn) {
                      		Em=Initialing.accounts.get(i).Email;
                      	}
                      }
                      System.out.println("what its type customer/admin/installer");
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
                      System.out.println(SuccessMsg);}
                      else {
                      	System.out.println(failMsg);
                      
                       }
                      	}
                   else  if(answerIntIn==8) {//Delete User
                	   System.out.println("---Deleting User---");
                	   myObj.nextLine();
                    	((Admin) u).showAllUsers();
                    	String Em=null;
                     System.out.println(msg4);
                     answerIntIn=myObj.nextInt();
                     for(int i=0;i<Initialing.accounts.size();i++) {
                     	if(i==answerIntIn) {
                     		Em=Initialing.accounts.get(i).Email;
                     	}
                     }
                       boolean done1=((Admin) u).deleteUser(Em);
                       if(done1) {
                       System.out.println(SuccessMsg);}
                       else {
                       	System.out.println(failMsg);
                       }
                       	}
                   else if(answerIntIn==9) {//show users
                     	System.out.println("---Showing Users ---");
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
            System.out.println(msg5);	
            continue;	
            }
            }
            
            while(u.Type==3) { //customer
            	 int answerIntIn;
                	int answerIntInIn;

                    String answerStringIn;
                    
                    answerInt=-1;
                     System.out.println("---Welcome Custumer "+u.Name+msg);
                     System.out.println("1. Browse products");
                     System.out.println("2. Make purchases");
                     System.out.println("3. view All orders");
                     System.out.println("4. view my Installation");
                     System.out.println("5. Edit Profile");
                     System.out.println("6. logOut");
                     System.out.println(msg2);
                      answerInt= myObj.nextInt();
                     if(answerInt==1) {//Browse products
                     	System.out.println("---Browsing products---");
                        myObj.nextLine();  
                         System.out.println("please Enter the description of the product you want");
                         answerStringIn= myObj.nextLine();       
                         boolean done=((Customer)u).Searchproduct(answerStringIn);
                         if(done) {
                             System.out.println("***this is the similar products***");}
                             else {
                             	System.out.println("***Sorry this process falied,TRY AGAIN***");
                             }
                           }
                     else if(answerInt==2) {//Make purchases
                       	System.out.println("---Make purchases---");
                       	myObj.nextLine(); 
                       	Product p;
                       	boolean done=false;
                        ((Customer)u).showAllproducts();
                        String prod=null;
                        System.out.println("please Enter the # of product you wanna order");
                        answerIntIn=myObj.nextInt();
                        for(int i=0;i<Initialing.productsLL.size();i++) {
                        	if(answerIntIn==i) {
                        	p=Initialing.productsLL.get(i);
                        	if(!p.needInst) {
                            	done=((Customer)u).makeSimpleOrder(p);
                            	}
                            else {
                               System.out.println("$This product need installation$");
                               myObj.nextLine(); 
                               System.out.println("do you want us to afford you an installer? y/n");
                               System.out.println("PS:this will plus 50 to the total price");
                               answerStringIn=myObj.nextLine();
                               if(answerStringIn.equalsIgnoreCase("y")) {
                            	   System.out.println("Please enter your car MODEL");
                                   String model=myObj.nextLine();
                                   System.out.println("Please enter Preferred date in this pattern yyyy-MM-dd HH:mm");
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
                        System.out.println("***Success***");}
                        else {
                        	System.out.println(failMsg);
                      }
                        }
                        
                    
                     else if(answerInt==3) {//View Orders
                      	System.out.println("---Viewing All orders---");
                     
                          ((Customer)u).viewOrders();
                     }
                     else if(answerInt==4) {//View installations
                       	System.out.println("---Viewing my Installations---");
                       	int i=0;
                      for(Installation c:((Customer)u).getMyInst()) {
                    	  System.out.println(i+": "+c);
                    	  i++; }
                      }
                     
                     while(answerInt==5) {// managing my account
                     	myObj.nextLine();
                     	answerIntIn=-1;
                         System.out.println("---Managing My Account---");
                         System.out.println(msg);
      
                         System.out.println("1. Show MY data");
                         System.out.println("2. Edit MY Password");
                         System.out.println("3. Edit MY Name");
                         System.out.println("4. Edit MY Phone");
                         System.out.println("5. Edit MY Address");
                         System.out.println("6. Back");
                         System.out.println(msg2);
                         answerIntIn= myObj.nextInt();  
                         if(answerIntIn==1) {//Show my Data
                            	System.out.println("---Customer"+u.Name+"---");
                            	
                            	System.out.println("---------------------------------");
                            	System.out.println(u);
                            	System.out.println("---------------------------------");

                            	
                          }
                           
                         else if(answerIntIn==2) {//edit my pass
                         	   System.out.println("---Editing User password---");
                         	   myObj.nextLine();
                         	  System.out.println("Please enter your OLD pass");
                              
                              String oldPass=myObj.nextLine();
                              
                                System.out.println("Please enter your NEW pass");
                               
                                String newPass=myObj.nextLine();
                                boolean done=((Customer) u).changeMyPass(oldPass, newPass);
                                if(done) {
                                System.out.println(SuccessMsg);}
                                else {
                                	System.out.println(failMsg);
                                }
                               	}
                            else if(answerIntIn==3) {//edit my name
                         	   System.out.println("---Editing my name---");
                         	   myObj.nextLine();
                              	
                               System.out.println("Please enter your NEW Name ");
                               
                               String newName=myObj.nextLine();
                               boolean done1=((Customer) u).changeMyData(Email, newName,"","");
                               if(done1) {
                               System.out.println(SuccessMsg);}
                               else {
                               	System.out.println(failMsg);
                               
                                }
                               	}
                            else if(answerIntIn==4) {//edit user PHONE
                            	System.out.println("---Editing my phone---");
                          	   myObj.nextLine();
                               	
                                System.out.println("Please enter your NEW phone ");
                                
                                String newP=myObj.nextLine();
                                boolean done1=((Customer) u).changeMyData(Email,"",newP,"");
                                if(done1) {
                                System.out.println(SuccessMsg);}
                                else {
                                	System.out.println(failMsg);
                                
                                 }
                               	}
                            else if(answerIntIn==5) {//edit my Address
                            	System.out.println("---Editing my Address---");
                          	   myObj.nextLine();
                               	
                                System.out.println("Please enter your NEW Address ");
                                myObj.nextLine();
                                String newAdd=myObj.nextLine();
                                boolean done1=((Customer) u).changeMyData(Email, "","",newAdd);
                                if(done1) {
                                System.out.println(SuccessMsg);}
                                else {
                                	System.out.println(failMsg);
                                
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
                     System.out.println(msg5);	
                     continue;	
                     }
                     }
            while(u.Type==2) { // installer
            	 int answerIntIn;
             	int answerIntInIn;

                 String answerStringIn;
                 
                 answerInt=-1;
                  System.out.println("---Welcome Installer "+u.Name+msg);
                  System.out.println("1. View installation requests");
                  System.out.println("2. View my Own installation");
                  System.out.println("3. make an appointment");
                  System.out.println("4. Check as Done");
                  System.out.println("5. logOut");
                  System.out.println(msg2);
                   answerInt= myObj.nextInt();
                  if(answerInt==1) {//Viewing all Installation requests
                  	System.out.println("---Viewing all INSTALLATIONs' requests---");
                     ((Installer)u).showAllInstallations();
                     for(Installation i:Initialing.installationRequests) {
                     EmailSender.sendEmail(i.custEmail,"Car Accessouries: 2nd Update","Your Order status[Waiting]\n we are waiting for you to bring the car to Our Center");

                     }
                     //2nd notification {Waiting-----> the installation is waiting an installer to take it
                        }
                  else if(answerInt==2) {//show my installation
                    	System.out.println("---Show my INSTALLATIONs---");
                    	((Installer)u).showMyInstallations();
                     }
                     
                 
                  else if(answerInt==3) {//schedual appointment
                   	System.out.println("---Let's schedual an appointment---");
                       ((Installer)u).showAllInstallations();
                     //2nd notification {Waiting-----> the installation is waiting an installer to take it
                       for(Installation i:Initialing.installationRequests) {
                           EmailSender.sendEmail(i.custEmail,"Car Accessouries:2nd Update","Your Order status[Waiting]\n we are waiting for you to bring the car to Our Center");

                           }
                     System.out.println("This is all INSTALLATIONs available to take\n Please enter the # of the INSTALLATION you want to START work with");
                     answerIntIn=myObj.nextInt();
                     ((Installer)u).AddInstallationToWork(answerIntIn);
                     //3rd notification {In Process-----> the installation is In process
                     EmailSender.sendEmail(((Installer)u).myInstWork.get(answerIntIn).custEmail,"Car Accessouries: 3rd Update","Your Order status[In Process]\n Installer is WORKING on it");
                  }
                  else if(answerInt==4) {//check as done 
                		System.out.println("---Let's schedual an appointment---");
                        ((Installer)u).showMyInstallations();
                      System.out.println("This is all your INSTALLATIONs \n Please enter the # of the INSTALLATION you finished working with");
                      answerIntIn=myObj.nextInt();
                      ((Installer)u).changeStatustoDone(answerIntIn);
                      EmailSender.sendEmail(((Installer)u).myInstWork.get(answerIntIn).custEmail,"Car Accessouries: 4th Update","Your Order status [Done]\n Your car is done\nYou can come to take it");

                   }
                  
                 
                  else if(answerInt==5) {// log out
                  	break;
                  }
                  else if(answerInt<1&&answerInt>5) {
                  System.out.println(msg5);	
                  continue;	
                  }
            	
            }
            
            if(u.Type!=1&&u.Type!=2&&u.Type!=3) {
            System.out.println("Wrong email and Password,TRY AGAIN");
            continue;
            }
}
	    }
	    else if(answer.equalsIgnoreCase("n")){//new account
	    	int answerIntIn=-1;
	    	boolean done=false;
	    	 System.out.println("You must be a new visitor please sign in to continue");
	    	 System.out.println("1.Sign In");
	    	 System.out.println("2.Cancel");
             answerIntIn= myObj.nextInt();  
             if(answerIntIn==1) {//Register
                	System.out.println("---Sign In---");
                 System.out.println("Please enter your Email");
                 myObj.nextLine();
                 String em=myObj.nextLine();
                 AuthenAndReg.checkUser(em, "");
                 if(AuthenAndReg.emailAv){
                	 done=true;}
                 
                 System.out.println("Please enter your Password");
           
                 String pass=myObj.nextLine();
                 System.out.println("Please enter your Name ");
                
                 String name=myObj.nextLine();
                 System.out.println("Please enter your Phone ");
                 
                 String phone=myObj.nextLine();
                 System.out.println("Please enter your Address");
                 
                 String address=myObj.nextLine();
         
               
                 if(done) {
                	 User a=new User(em,pass,name,phone,address);
                    a.Type=3;
                     System.out.println("***Successfully Registered***");
                     System.out.println("NOW,Please log In");
                 }
                     else {
                     	System.out.println(failMsg);
                     }}
                 if(answerIntIn==2) {
                	 break;
                	 }
          else if(answer.equalsIgnoreCase("x")){break;}
          else continue;
	    }}while(true);


	}



}
