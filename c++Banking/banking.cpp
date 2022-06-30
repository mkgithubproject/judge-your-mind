#include<iostream>
using namespace std;

void disAcc(int acc_bnk[3][4]){
    // dispaly all account details
    cout<<"---------------------------------------------"<<endl;
    cout<<"              VIEW ACCOUNTS                  "<<endl;
    cout<<"---------------------------------------------"<<endl;
    for(int i=0;i<3;i++){
            cout<<"Account Number: "<<acc_bnk[i][0]<<endl;
            cout<<"Pin code      : "<<acc_bnk[i][1]<<endl;
            string type="";
            if(acc_bnk[i][2]==0){
                type="Savings";
            }else{
                type="Credit Card";
            }
            cout<<"Account Type  : "<<type<<endl;
            cout<<"Balance       : "<<acc_bnk[i][3]<<endl;
            cout<<"---------------------------------------------"<<endl;
    }
}
int witAcc(int balance){
    // withdraw money
   cout<<"---------------------------------------------"<<endl;
    cout<<"[           W I T H D R A W                  ]"<<endl;
    cout<<"---------------------------------------------"<<endl;
    cout<<"Enter Amount:              ";
    int amount;
    cin>>amount;
    cout<<"---------------------------------------------"<<endl;
    if(amount>balance){
        cout<<"Insufficient Balace!"<<endl;
        cout<<"---------------------------------------------"<<endl;
        return balance;
    }else{
        cout<<"Transaction Completed!"<<endl;
        return balance-amount;
    }
}
int depAcc(int balance){
    // deposite money
   cout<<"---------------------------------------------"<<endl;
    cout<<"[           D E P O S I T                   ]"<<endl;
    cout<<"---------------------------------------------"<<endl;
    cout<<"Enter Amount:              ";
    int amount;
    cin>>amount;
    cout<<"---------------------------------------------"<<endl;
    if(amount<=0){
        cout<<"Invalid amount entered!"<<endl;
        cout<<"---------------------------------------------"<<endl;
        return balance;
    }else{
        cout<<"Transaction Completed!"<<endl;
        return balance+amount;
    }
}

int main (){
    int trans;
    bool mainLoop = true;
    int bnk_acc[3][4] = {{100001, 1111, 9, 15000}, {100003, 3333, 0, 100000}, {100005, 5555, 0, 500}} ;// initialize accounts
    do {
        // UI
      cout<<"---------------------------------------------"<<endl;
      cout<<"               Select Transaction            "<<endl;
      cout<<"---------------------------------------------"<<endl;
      cout<<"[0] view Accounts"<<endl;
      cout<<"[1] Withdraw"<<endl;
      cout<<"[2] Deposit"<<endl;
      cout<<"[3] End of Program"<<endl;
      cout<<"---------------------------------------------"<<endl;
      bool doItAgain;
      do{
          doItAgain=false;
          int acn,pin,ctr=7;
          cout<<"Transaction: ";
          cin>>trans;
          cout<<endl;
          if(trans>=0 && trans<=3){
              if(trans==0){
                  disAcc(bnk_acc);
              }else if(trans==3){
                  mainLoop=false;
              }else{
                  cout<<"Enter Account Number: ";
                  cin>>acn;
                  cout<<"Pin code: ";
                  cin>>pin;
                  for(int i=0;i<3;i++){
                      if(acn==bnk_acc[i][0] && pin==bnk_acc[i][1]){
                          ctr=i;
                      }
                  }
                  if(ctr==7){
                      trans=4;
                  }
                  if(trans==1){
                      bnk_acc[ctr][3]=witAcc(bnk_acc[ctr][3]);
                  }else if(trans==2){
                      bnk_acc[ctr][3]=depAcc(bnk_acc[ctr][3]);
                  }else if(trans==4){
                      mainLoop=false;
                      cout<<"---------------------------------------------"<<endl;
                      cout<<"       No Existing Account"<<endl;
                      cout<<"       Transaction Reported!"<<endl;
                      cout<<"---------------------------------------------"<<endl;
                      
                  }
                  
              }
              
          }else{
                  cout<<"---------------------------------------------"<<endl;
                  cout<<"       Invalid Transaction Selected!"<<endl;
                  cout<<"---------------------------------------------"<<endl;
                  doItAgain=true;
              }
              cout<<endl;
          }while(doItAgain);
      }while(mainLoop);
      cout<<"\nEnd of Program\n";
      return 0;
      
    }
