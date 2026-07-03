class Solution {

    public static void solve(String num,int target,long curr,long prev,int i,StringBuilder sb,List<String> list){

        if(i==num.length()){
            if(curr==target){
                list.add(sb.toString());
            }
            return;
        }

        long val=0;

        for(int j=i;j<num.length();j++){

            if(j>i && num.charAt(i)=='0'){
                break;
            }

            val=val*10+(num.charAt(j)-'0');

            int len=sb.length();

            if(i==0){

                sb.append(val);
                solve(num,target,val,val,j+1,sb,list);
                sb.setLength(len);

            }else{

                sb.append("+").append(val);
                solve(num,target,curr+val,val,j+1,sb,list);
                sb.setLength(len);

                sb.append("-").append(val);
                solve(num,target,curr-val,-val,j+1,sb,list);
                sb.setLength(len);

                sb.append("*").append(val);
                solve(num,target,curr-prev+(prev*val),prev*val,j+1,sb,list);
                sb.setLength(len);
            }
        }
    }

    public List<String> addOperators(String num, int target) {

        List<String> list=new ArrayList<>();

        solve(num,target,0,0,0,new StringBuilder(),list);

        return list;
    }
}