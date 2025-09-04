public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0, sumCost = 0;
        for(int i = 0; i < gas.length; i++) {
            sumGas  += gas[i];
            sumCost += cost[i]; 
        }
        if(sumGas < sumCost) 
            return -1;
        int tank = 0, start = 0;
        for(int i = 0; i < gas.length; i++) {
            tank  += gas[i] - cost[i];
            if(tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }
        return start;
    }
