package $package;format="lower,package"$
package $name;format="lower,word"$

import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

trait UnitSpec extends AnyFlatSpec with should.Matchers
