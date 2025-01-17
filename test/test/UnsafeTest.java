package test;

import net.auoeke.result.Result;
import net.gudenau.lib.unsafe.Unsafe;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class UnsafeTest extends Unsafe {
	@Test void allocateInstanceTest() {
		assert allocateInstance(UnsafeTest.class).getClass() == UnsafeTest.class;
	}

	@Test void throwable() {
		var throwable = new Throwable();
		assert Result.of(() -> throwException(throwable)).cause().get() == throwable;
	}
}
