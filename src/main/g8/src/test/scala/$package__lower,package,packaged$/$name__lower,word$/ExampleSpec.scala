package $package;format="lower,package"$
package $name;format="lower,word"$

final class ExampleSpec extends UnitSpec {

  behavior of "hello world"

  it should "be true" in {
    1 shouldBe 1
  }
}
