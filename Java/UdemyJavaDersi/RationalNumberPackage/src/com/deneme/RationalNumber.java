package com.deneme;

import java.util.Objects;

public class RationalNumber implements Comparable<RationalNumber>{
    private int pay;
    private int payda;
    public RationalNumber(){
        pay=0;
        payda=1;
    }
    public RationalNumber(int pay,int payda){
        int ebob=ebobBul(pay,payda);
        this.pay=((payda> 0) ? 1 :-1)*(pay/ebob);
        this.payda=Math.abs(payda/ebob);
    }
    private int ebobBul(int pay,int payda){
        int payMutlakDeger=Math.abs(pay);
        int paydaMutlakDeger=Math.abs(payda);
        int ebob=1;
        for(int i=1;i<=payMutlakDeger && i<=paydaMutlakDeger;i++){
            if(payMutlakDeger%i==0 && paydaMutlakDeger%i ==0){
                ebob=i;
            }
        }
        return ebob;
    }
    public RationalNumber topla(RationalNumber num1){
        int yeniPay=(this.pay * num1.payda)+(num1.pay*this.payda);
        int yeniPayda=payda*num1.payda;
        RationalNumber sonuc=new RationalNumber(yeniPay,yeniPayda);
        return sonuc;
    }
    public RationalNumber cikar(RationalNumber num2){
        int yeniPay=(this.pay * num2.payda)-(num2.pay*this.payda);
        int yeniPayda=payda*num2.payda;
        RationalNumber sonuc=new RationalNumber(yeniPay,yeniPayda);
        return sonuc;
    }
    public RationalNumber carp(RationalNumber num3){
        int yeniPay=(this.pay * num3.pay);
        int yeniPayda=payda*num3.payda;
        RationalNumber sonuc=new RationalNumber(yeniPay,yeniPayda);
        return sonuc;
    }
    public RationalNumber bol(RationalNumber num4){
        int yeniPay=(this.pay * num4.payda);
        int yeniPayda=payda*num4.pay;
        RationalNumber sonuc=new RationalNumber(yeniPay,yeniPayda);
        return sonuc;
    }
    @Override
    public String toString() {
        if(payda==1){
            return pay+"";
        }else{
            return pay+"/"+payda;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return pay == that.pay && payda == that.payda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pay, payda);
    }

    @Override
    public int compareTo(RationalNumber o) {
        if(this.cikar(o).pay>0){
            return 1;
        }else if(this.cikar(o).pay<0){
            return -1;
        }else {
            return 0;
        }
    }
}
