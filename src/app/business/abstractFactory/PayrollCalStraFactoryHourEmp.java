package app.business.abstractFactory;

import java.util.ArrayList;
import java.util.List;

import app.business.BasicPayStrategyHourEmp;
import app.business.DeductionStrategyLeaveEmp;
import app.business.IBasicPayStrategy;
import app.business.IDeductionStrategy;
import app.business.IEarningStrategy;

public class PayrollCalStraFactoryHourEmp implements IPayrollCalculationStrategyFactory{
	
	@Override
	public List<IDeductionStrategy> getDeduStrategy() {
		// TODO Auto-generated method stub
		List<IDeductionStrategy> deduction= new ArrayList<IDeductionStrategy>();
		
		deduction.add(new DeductionStrategyLeaveEmp());
		 
		return deduction;
	}

	@Override
	public List<IEarningStrategy> getEarningStrategy() {
		// TODO Auto-generated method stub
		List<IEarningStrategy> earning= new ArrayList<IEarningStrategy>();
		/*no earning*/
		return earning;
	}

	@Override
	public List<IBasicPayStrategy> getBasicStrategy() {
		// TODO Auto-generated method stub
		List<IBasicPayStrategy> basicpay= new ArrayList<IBasicPayStrategy>();		
		
		basicpay.add(new BasicPayStrategyHourEmp());
		
		return basicpay;
	}

}