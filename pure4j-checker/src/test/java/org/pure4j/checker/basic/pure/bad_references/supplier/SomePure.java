package org.pure4j.checker.basic.pure.bad_references.supplier;

import org.pure4j.annotations.pure.Enforcement;
import org.pure4j.annotations.pure.Pure;

@Pure
public class SomePure {

	int i = 0;
	
	public void someOkCall() {
		i++;
	}
	
	@Pure(Enforcement.NOT_PURE)
	public void someNotPureCall() {
		System.out.println("sideeffect");
	}
}
