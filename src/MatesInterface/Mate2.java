package MatesInterface;
public final class Mate2 implements Extremos{
    @Override
    public int min(int a[]){
        int nmenor = a[0];
        for(int i = 0; i < a.length; i++){
            if(nmenor > a[i]) nmenor = a[i];
        }
        return nmenor;
    }
    @Override
    public int max(int a[]){
        int nmayor = a[0];
        for(int i = 0; i < a.length; i++){
            if(nmayor < a[i]) nmayor = a[i];
        }
        return nmayor;
    }
    @Override
    public double min(double a[]){
        double nmenor = a[0];
        for (int i = 0; i < a.length; i++){
            if(nmenor > a[i]) nmenor = a[i];
        }
        return nmenor;
    }
    @Override
    public double max(double a[]){
        double nmayor = a[0];
        for (int i = 0; i < a.length; i++) {
            if( nmayor < a[i]) nmayor = a[i];
        }
        return nmayor;
    }
}
