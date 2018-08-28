import org.apache.commons.math3.analysis.interpolation.LinearInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;

public class LinearProjection {
	
	public static void main(String[] args) {
		
		double[] x= {0,1,2};
		double[] y={0,2,9};
		
		PolynomialSplineFunction function = new LinearInterpolator().interpolate(x, y);
		PolynomialFunction[] splines = function.getPolynomials();
		PolynomialFunction first = splines[0];
		PolynomialFunction last = splines[splines.length-1];
		
		System.out.println(first);
		System.out.println(last);
		
	}

}
