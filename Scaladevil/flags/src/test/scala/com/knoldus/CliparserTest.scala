package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.Cliparser


class CliparserTest extends AnyFlatSpec{
  val obj = new Cliparser
  "--help" should "always return a pay contains details about all the flags" in {
    assert(obj.help_Flag===Map("-a"->"This flag returns @","-s"->"This flag returns $",("-i","This flag returns !"),("-k","This flag returns *")))
  }
  "--help" should "not return a () in any case" in {
    assert(obj.help_Flag!==())
  }
  

  "-s" should "always return $ for printing" in {
    assert(obj.check_Flag("-s") === '$')
  }
  "-s" should "not return anything other than $" in {
    assert(obj.check_Flag("-s") !== '@')
  }


  "-a" should "always return @ for printing" in {
    assert(obj.check_Flag("-a") === '@')
  }

  "-a" should "not return anything other than @" in {
    assert(obj.check_Flag("-a") !== '$')
  }


  "-k" should "always return * for printing" in {
    assert(obj.check_Flag("-k") === '*')
  }
  "-k" should "never return unit()" in {
    assert(obj.check_Flag("-k") !== ())
  }


  "-i" should "always return ! for printing" in {
    assert(obj.check_Flag("-i") === '!')
  }
  "-i" should "never return ! for printing" in {
    assert(obj.check_Flag("-i") === '!')
  }

  "If any wrong flag is passed it" should "always gives exception and return '^' Character" in {
    //-o is not any flag
    assert(obj.check_Flag("-o")==='^')
  }
}


