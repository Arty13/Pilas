/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the "entrega system".
 *
 */

package aed.stackmachine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;

import aed.positionlist.*;
import aed.lifo.*;
import aed.fifo.*;

/**
 * Implements tests for the {@link aed.stackmachine} package.
 */
public class TesterLab3 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq;
  static Field threadTerminated;

    /**
     * Executes a set of tests on the {@link aed.stackmachine} package.
     */
  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean ok_sofar = true;
    

    try {
      if (ok_sofar) ok_sofar = test_1();
      if (ok_sofar) ok_sofar = test_2();
      if (ok_sofar) ok_sofar = test_3();
      if (ok_sofar) ok_sofar = test_4();
      if (ok_sofar) ok_sofar = test_5();
      if (ok_sofar) ok_sofar = test_6();
      if (ok_sofar) ok_sofar = test_7();
      if (ok_sofar) ok_sofar = test_8();
      if (ok_sofar) ok_sofar = test_9();
      if (ok_sofar) ok_sofar = test_10();
      if (ok_sofar) ok_sofar = test_11();
      if (ok_sofar) ok_sofar = test_12();
      if (ok_sofar) ok_sofar = test_13();
      if (ok_sofar) ok_sofar = test_14();
      if (ok_sofar) ok_sofar = test_15();
      if (ok_sofar) ok_sofar = test_16();
      if (ok_sofar) ok_sofar = test_17();
      if (ok_sofar) ok_sofar = test_18();
      if (ok_sofar) ok_sofar = test_19();
      if (ok_sofar) ok_sofar = test_20();
      if (ok_sofar) ok_sofar = test_21();
      if (ok_sofar) ok_sofar = test_22();
      if (ok_sofar) ok_sofar = test_23();
      if (ok_sofar) ok_sofar = test_24();
      if (ok_sofar) ok_sofar = test_25();
      if (ok_sofar) ok_sofar = test_26();
      if (ok_sofar) ok_sofar = test_27();
      if (ok_sofar) ok_sofar = test_28();
      if (ok_sofar) ok_sofar = test_29();
      if (ok_sofar) ok_sofar = test_30();
      if (ok_sofar) ok_sofar = test_31();
      if (ok_sofar) ok_sofar = test_32();
      if (ok_sofar) ok_sofar = test_33();
      if (ok_sofar) ok_sofar = test_34();
      if (ok_sofar) ok_sofar = test_35();
      if (ok_sofar) ok_sofar = test_36();
      if (ok_sofar) ok_sofar = test_37();
      if (ok_sofar) ok_sofar = test_38();
      if (ok_sofar) ok_sofar = test_39();
      if (ok_sofar) ok_sofar = test_40();
      if (ok_sofar) ok_sofar = test_41();
      if (ok_sofar) ok_sofar = test_42();
      if (ok_sofar) ok_sofar = test_43();
      if (ok_sofar) ok_sofar = test_44();
      if (ok_sofar) ok_sofar = test_45();
      if (ok_sofar) ok_sofar = test_46();
      if (ok_sofar) ok_sofar = test_47();
      if (ok_sofar) ok_sofar = test_48();
      if (ok_sofar) ok_sofar = test_49();
      if (ok_sofar) ok_sofar = test_50();
      if (ok_sofar) ok_sofar = test_51();
      if (ok_sofar) ok_sofar = test_52();
      if (ok_sofar) ok_sofar = test_53();
      if (ok_sofar) ok_sofar = test_54();
      if (ok_sofar) ok_sofar = test_55();
      if (ok_sofar) ok_sofar = test_56();
      if (ok_sofar) ok_sofar = test_57();
      if (ok_sofar) ok_sofar = test_58();
      if (ok_sofar) ok_sofar = test_59();
      if (ok_sofar) ok_sofar = test_60();
      if (ok_sofar) ok_sofar = test_61();
      if (ok_sofar) ok_sofar = test_62();
      if (ok_sofar) ok_sofar = test_63();
      if (ok_sofar) ok_sofar = test_64();
      if (ok_sofar) ok_sofar = test_65();
      if (ok_sofar) ok_sofar = test_66();
      if (ok_sofar) ok_sofar = test_67();
    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          ok_sofar = false;
      }


    if (ok_sofar)
      System.out.println("\n TesterLab3: Test finalizado correctamente.");

    if (ok_sofar)
      System.exit(0);
    else
      System.exit(24);
  }



  private static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(1) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 1 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(8) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 8 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Dup() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Swap() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(6),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(0),new Instructions.Dup() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 0,0 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(0),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(1),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { -1 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(1),new Instructions.Load(-1),new Instructions.Power() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 1 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(1),new Instructions.Load(-2),new Instructions.Power() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 1 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(0),new Instructions.Load(-2),new Instructions.Power() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { -2,0 },new ArithmeticException()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(10),new Instructions.Load(-2),new Instructions.Power() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 0 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(0),new Instructions.Load(1),new Instructions.Swap() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 0,1 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(0),new Instructions.Load(1),new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 1 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(10),new Instructions.Load(2),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 5 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(0),new Instructions.Load(2),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 0 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(10),new Instructions.Load(2),new Instructions.Power() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 100 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(6),new Instructions.Load(6),new Instructions.Power(),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(3),new Instructions.Neg(),new Instructions.Load(6),new Instructions.Div(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Neg(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Load(5),new Instructions.Dup(),new Instructions.Add(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Load(3),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Load(9) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 9,3 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Load(1),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Neg(),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(7),new Instructions.Neg(),new Instructions.Load(1),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(8),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Load(3),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Dup() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { -8,-8 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(5),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(6),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Swap(),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 0,0 },new ArithmeticException()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(6),new Instructions.Load(7),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Load(6),new Instructions.Add(),new Instructions.Load(1),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Load(6),new Instructions.Power(),new Instructions.Load(6),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Dup(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Swap(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(4) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 4 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(9),new Instructions.Load(8),new Instructions.Swap(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Load(2),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Div(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Load(1),new Instructions.Div(),new Instructions.Swap(),new Instructions.Div(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Power(),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Load(9),new Instructions.Load(7),new Instructions.Swap(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(8),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Load(5),new Instructions.Power(),new Instructions.Load(2),new Instructions.Add(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { -245 },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(10),new Instructions.Load(2),new Instructions.Add() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(15) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { 15 },null),new TerminationRecord(0,threadcodes_0,new Integer[] { 12 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(10),new Instructions.Load(2),new Instructions.Add() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(15),new Instructions.Load(4),new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 12 },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 19 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(6),new Instructions.Neg(),new Instructions.Dup() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(3),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Swap() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { -6,-6 },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 2 },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(1),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(2),new Instructions.Load(7),new Instructions.Div(),new Instructions.Neg(),new Instructions.Load(2),new Instructions.Div(),new Instructions.Drop(),new Instructions.Neg() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(3),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Neg(),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 6 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(9),new Instructions.Drop(),new Instructions.Div() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(3) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 3 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(6),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Load(5),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Load(1) } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Power() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] { 1,-9,9 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(8),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(4),new Instructions.Add(),new Instructions.Load(6),new Instructions.Load(2),new Instructions.Add(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Div() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(4),new Instructions.Load(6),new Instructions.Div(),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { 0,0 },new ArithmeticException()),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(8),new Instructions.Load(9),new Instructions.Power(),new Instructions.Load(4),new Instructions.Div(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Power(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(7),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { -7 },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(3),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Neg(),new Instructions.Load(2),new Instructions.Add(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },null),new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(9),new Instructions.Neg(),new Instructions.Dup() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(4),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Load(6),new Instructions.Power(),new Instructions.Neg(),new Instructions.Load(2),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { -9,-9 },null),new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Load(3),new Instructions.Power(),new Instructions.Load(2),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(4) } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(7),new Instructions.Load(9),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Add(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Power(),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { -62748517 },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] { 4 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4),new Instructions.Load(1),new Instructions.Neg(),new Instructions.Load(2),new Instructions.Neg(),new Instructions.Div(),new Instructions.Div() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(5),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(1),new Instructions.Div(),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(3) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 0,4 },new ArithmeticException()),new TerminationRecord(1,threadcodes_1,new Integer[] { 3 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Load(6),new Instructions.Power(),new Instructions.Load(3),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Load(4),new Instructions.Load(6),new Instructions.Add(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(4),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Load(1),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Load(5),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Add(),new Instructions.Add(),new Instructions.Add(),new Instructions.Div() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Load(6),new Instructions.Power(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] { 0,8 },new ArithmeticException()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(5),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Add(),new Instructions.Load(7),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Neg() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Swap() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(8) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Load(4),new Instructions.Power(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Load(4),new Instructions.Load(5),new Instructions.Div(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(3),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 8 },null),new TerminationRecord(2,threadcodes_2,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4) } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(5),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Dup(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Load(5),new Instructions.Dup() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(5),new Instructions.Load(8),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 4 },null),new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 5,5,-1647086 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Add() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Swap() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(6),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(2,threadcodes_2,new Integer[] { -6 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4),new Instructions.Load(4),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Load(4) } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Neg(),new Instructions.Neg() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] { 4,2 },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 9 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(3),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Power() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(8),new Instructions.Drop() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(1),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Load(6),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Load(9),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Drop(),new Instructions.Dup() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] {  },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Add() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Neg(),new Instructions.Load(4),new Instructions.Load(4) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Load(3),new Instructions.Load(9),new Instructions.Add(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Load(9),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 4,4,-5 },null),new TerminationRecord(2,threadcodes_2,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Load(2),new Instructions.Power(),new Instructions.Neg(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Load(3),new Instructions.Dup(),new Instructions.Load(9),new Instructions.Add(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Div(),new Instructions.Load(2),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(8) } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(7) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(7),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Div(),new Instructions.Dup(),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { 7 },null),new TerminationRecord(2,threadcodes_2,new Integer[] { 0,0 },new ArithmeticException()),new TerminationRecord(0,threadcodes_0,new Integer[] { 8 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4),new Instructions.Neg(),new Instructions.Load(5),new Instructions.Swap(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Load(6),new Instructions.Neg(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Load(4),new Instructions.Power(),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Power() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(6),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(2,threadcodes_2,new Integer[] { 7 },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 387420489 },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(5),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Load(8),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Add() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Dup(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Neg() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(9),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { -9 },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4),new Instructions.Load(1),new Instructions.Power(),new Instructions.Load(4),new Instructions.Neg(),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Neg() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(4),new Instructions.Dup(),new Instructions.Power(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(8) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Load(7),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Load(3) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { 8 },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(2,threadcodes_2,new Integer[] { 3,5 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Load(8),new Instructions.Div(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(6),new Instructions.Load(3),new Instructions.Load(4) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Power() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 4,3,6 },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Dup(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(2),new Instructions.Dup(),new Instructions.Div(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Drop() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Load(8),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Load(1),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Load(3),new Instructions.Drop(),new Instructions.Add(),new Instructions.Div() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] {  },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(2,threadcodes_2,new Integer[] { 0,-16 },new ArithmeticException()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(7),new Instructions.Load(6),new Instructions.Load(3),new Instructions.Add(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Load(8),new Instructions.Add(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(2),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Div() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(9),new Instructions.Swap() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Load(2),new Instructions.Power(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { 9 },new StackUnderFlowExc()),new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(7),new Instructions.Dup(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Dup(),new Instructions.Load(3),new Instructions.Load(7),new Instructions.Swap(),new Instructions.Div(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(8) } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(7),new Instructions.Load(9),new Instructions.Add(),new Instructions.Load(2),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Swap() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(3) } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(2,threadcodes_2,new Integer[] { 3 },null),new TerminationRecord(3,threadcodes_3,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] { 8 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(9),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(3),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(6) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(9),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(8),new Instructions.Load(3),new Instructions.Load(7),new Instructions.Power(),new Instructions.Div(),new Instructions.Load(2),new Instructions.Add(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Neg(),new Instructions.Load(9),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 6 },null),new TerminationRecord(2,threadcodes_2,new Integer[] {  },null),new TerminationRecord(3,threadcodes_3,new Integer[] { -2 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(5),new Instructions.Load(8),new Instructions.Add(),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Load(6),new Instructions.Load(8) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(1),new Instructions.Drop(),new Instructions.Add() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(2),new Instructions.Drop(),new Instructions.Dup() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(3,threadcodes_3,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] {  },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 8,6,4,4,4 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Swap() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Load(2),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Dup() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(6),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Div() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(3,threadcodes_3,new Integer[] { -6 },null),new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 8,8 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(5),new Instructions.Dup(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Dup(),new Instructions.Load(8),new Instructions.Load(2),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Swap(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Div(),new Instructions.Neg(),new Instructions.Load(1),new Instructions.Neg(),new Instructions.Add(),new Instructions.Neg(),new Instructions.Div() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(1) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(3) } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(3),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Neg(),new Instructions.Load(2),new Instructions.Add(),new Instructions.Neg(),new Instructions.Load(4),new Instructions.Power(),new Instructions.Neg(),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { 1 },null),new TerminationRecord(2,threadcodes_2,new Integer[] { 3 },null),new TerminationRecord(3,threadcodes_3,new Integer[] { 16 },null),new TerminationRecord(0,threadcodes_0,new Integer[] { 1 },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(2),new Instructions.Load(1),new Instructions.Load(5) } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(6),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(8) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Load(9),new Instructions.Div() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Load(2),new Instructions.Swap(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Load(8),new Instructions.Add(),new Instructions.Swap(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Swap(),new Instructions.Add(),new Instructions.Neg() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] { 5,1,2 },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 8 },null),new TerminationRecord(2,threadcodes_2,new Integer[] { 0 },null),new TerminationRecord(3,threadcodes_3,new Integer[] { -18 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(9),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Dup() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Load(6),new Instructions.Load(3),new Instructions.Add(),new Instructions.Swap(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Swap() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(1),new Instructions.Neg(),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(3,threadcodes_3,new Integer[] {  },null),new TerminationRecord(0,threadcodes_0,new Integer[] { -8 },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 5,5 },null),new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(8),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(5),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(2) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Swap(),new Instructions.Power(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Neg(),new Instructions.Neg() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(4),new Instructions.Load(6),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Neg(),new Instructions.Load(8) } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(1,threadcodes_1,new Integer[] { 2 },null),new TerminationRecord(0,threadcodes_0,new Integer[] {  },null),new TerminationRecord(2,threadcodes_2,new Integer[] { 4 },null),new TerminationRecord(3,threadcodes_3,new Integer[] { 8,-7 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(2),new Instructions.Load(4),new Instructions.Div(),new Instructions.Dup(),new Instructions.Swap(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Load(7),new Instructions.Load(1),new Instructions.Div(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Load(5),new Instructions.Add(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Add(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Load(1),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Div() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(5),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Load(5),new Instructions.Div(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Swap() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(4),new Instructions.Dup() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(3,threadcodes_3,new Integer[] { 4,4 },null),new TerminationRecord(2,threadcodes_2,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] {  },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(6),new Instructions.Dup(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Dup(),new Instructions.Load(7),new Instructions.Power(),new Instructions.Add(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Dup(),new Instructions.Power(),new Instructions.Load(1),new Instructions.Swap(),new Instructions.Power() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(5),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(7),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Drop(),new Instructions.Load(5),new Instructions.Load(6) } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(3),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Neg() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(4),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Neg(),new Instructions.Load(1),new Instructions.Div(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Load(4),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Dup(),new Instructions.Div(),new Instructions.Load(6),new Instructions.Drop(),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(2,threadcodes_2,new Integer[] { -1 },null),new TerminationRecord(1,threadcodes_1,new Integer[] { 6,5 },null),new TerminationRecord(0,threadcodes_0,new Integer[] { 1 },null),new TerminationRecord(3,threadcodes_3,new Integer[] { -3 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(8),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Drop() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(3),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Div(),new Instructions.Neg(),new Instructions.Load(9),new Instructions.Add(),new Instructions.Drop(),new Instructions.Load(1),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Dup(),new Instructions.Power(),new Instructions.Drop() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(4),new Instructions.Neg(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(6),new Instructions.Load(2),new Instructions.Neg(),new Instructions.Load(3),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Div(),new Instructions.Dup(),new Instructions.Add(),new Instructions.Drop(),new Instructions.Neg(),new Instructions.Drop(),new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(3),new Instructions.Neg(),new Instructions.Load(1),new Instructions.Add(),new Instructions.Load(1),new Instructions.Power(),new Instructions.Neg(),new Instructions.Dup(),new Instructions.Power(),new Instructions.Dup(),new Instructions.Drop(),new Instructions.Add() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(5),new Instructions.Drop(),new Instructions.Swap() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(3,threadcodes_3,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(0,threadcodes_0,new Integer[] {  },null),new TerminationRecord(1,threadcodes_1,new Integer[] {  },null),new TerminationRecord(2,threadcodes_2,new Integer[] { 4 },new StackUnderFlowExc()) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      
      Instruction[] threadcodes_0 = new Instruction[] { new Instructions.Load(4),new Instructions.Drop(),new Instructions.Add() } ;
      Instruction[] threadcodes_1 = new Instruction[] { new Instructions.Load(6),new Instructions.Load(6),new Instructions.Load(5),new Instructions.Add(),new Instructions.Dup(),new Instructions.Neg(),new Instructions.Load(6),new Instructions.Div(),new Instructions.Power(),new Instructions.Drop(),new Instructions.Dup() } ;
      Instruction[] threadcodes_2 = new Instruction[] { new Instructions.Load(2),new Instructions.Drop(),new Instructions.Load(8),new Instructions.Neg(),new Instructions.Div() } ;
      Instruction[] threadcodes_3 = new Instruction[] { new Instructions.Load(4),new Instructions.Dup(),new Instructions.Load(7),new Instructions.Div(),new Instructions.Drop(),new Instructions.Load(9),new Instructions.Drop(),new Instructions.Add() } ;
      
      TerminationRecord[] terminationRecords = new TerminationRecord[] { new TerminationRecord(0,threadcodes_0,new Integer[] {  },new StackUnderFlowExc()),new TerminationRecord(2,threadcodes_2,new Integer[] { -8 },new StackUnderFlowExc()),new TerminationRecord(3,threadcodes_3,new Integer[] { 4 },new StackUnderFlowExc()),new TerminationRecord(1,threadcodes_1,new Integer[] { 6,6 },null) } ;
      
      Instruction[][] instructions = new Instruction[][] { threadcodes_0,threadcodes_1,threadcodes_2,threadcodes_3 } ;
      
      if (ok_sofar)
          ok_sofar = TesterLab3.runSystem(instructions,1,terminationRecords) ;
      return ok_sofar ;
  }
    @SuppressWarnings("unchecked") static boolean runSystem(Instruction[][] instructions, int maxInstructions, TerminationRecord[] terminationRecords) {
	boolean ok_sofar = true;
	Thread oneThread = null;

	Thread[] threads = new Thread[instructions.length];
	int i=0;
	for (Instruction[] threadInstructions : instructions) {
	    Thread thread = new Thread(i,threadInstructions);
	    oneThread = thread;
	    threads[i++] = thread;
	}

	ThreadSystem system = new ThreadSystem(threads, maxInstructions);
	PositionList<Thread> result = null;

	if (ok_sofar) {
	    Field terminatedField = null;
	    try {
		terminatedField = oneThread.getClass().getDeclaredField("terminated");
		terminatedField.setAccessible(true);
		threadTerminated = terminatedField;
		PositionList<Thread> pl = new NodePositionList<Thread>();
		threadTerminated.set(oneThread,pl);
	    } catch ( Throwable exc ) {
		printCallException("access the field terminated",exc);
		ok_sofar = false;
	    }
	}

	if (ok_sofar) {
	    try { 
		result = (PositionList<Thread>) threadTerminated.get(oneThread);
	    } catch ( Throwable exc ) {
		printCallException("access the elements terminated",exc);
		exc.printStackTrace();
		ok_sofar = false;
	    }

	    if (ok_sofar) {
		try { system.run(); }
		catch ( Throwable exc ) {
		    printError
			(ExecutionTime.UNRELATED,
			 "ThreadSystem.run() raised the exception "+exc);
		    exc.printStackTrace();
		    printExpectedExecution(terminationRecords);
		    return false;
		}
	    }
	
	    if (ok_sofar)
		ok_sofar =
		    matchTerminationRecordAgainstThreadPositionList
		    (terminationRecords,result);
	}
	
	return ok_sofar;
    }

    @SuppressWarnings("unchecked")
    static boolean matchTerminationRecordAgainstThreadPositionList(TerminationRecord[] records, PositionList<Thread> result) {
	boolean ok_sofar = true;

	if (result.size() != records.length) {
	    printError
		(ExecutionTime.UNRELATED,
		 "fewer threads have halted than "+
		 "were running;\nnumber of halted threads="+result.size()+
		 "; number of threads expected to halt="+records.length);
	    printExpectedExecution(records);
	    return false;
	}

	/*
	 * We can check that any exception was raised at the right place...
	 */
	int i=0;
	Position<Thread> cursor = result.first();
	while (cursor != null) {
	    Thread thread = cursor.element();
	    TerminationRecord tr = records[i++];

	    if (thread.getId() != tr.id) {
		printError
		    (ExecutionTime.UNRELATED,
		     "The thread "+thread.getId()+
		     " terminated before thread "+tr.id+
		     " but the reverse should be true\nmaxInstructions=1");
		System.out.println(printExecution(thread));
		printExpectedExecution(records);
		return false;
	    }

	    if (tr.exc != null) {
		if (!thread.raisedException()) {
		    printError
			(ExecutionTime.UNRELATED,
			 "The thread "+tr.id+
			 " should have raised the exception "+
			 tr.exc+" but did not");
		    System.out.println(printExecution(thread));
		    printExpectedExecution(records);
		    return false;
		}

		if (!exceptionEquals(tr.exc,thread.getException())) {
		    printError
			(ExecutionTime.UNRELATED,
			 "The thread "+tr.id+
			 " should have raised the exception "+
			 tr.exc+" but raised the exception "+thread.getException());
		    thread.getException().printStackTrace();
		    System.out.println(printExecution(thread));
		    printExpectedExecution(records);
		    return false;
		}
	    }

	    if (tr.exc == null && thread.raisedException()) {
		printError
		    (ExecutionTime.UNRELATED,
		     "The thread "+tr.id+
		     " raised the exception "+thread.getException()+
		     " but it should not have");
		thread.getException().printStackTrace();
		System.out.println(printExecution(thread));
		printExpectedExecution(records);
		return false;
	    }

	    if (tr.exc == null) {
		LIFO<Integer> threadStack = null;

		try {
		    Field stackField = 
			thread.getClass().getDeclaredField("stack");
		    stackField.setAccessible(true);
		    threadStack = (LIFO<Integer>) stackField.get(thread);
		} catch ( Throwable exc ) {
		    printCallException("access the thread fields",exc);
		    throw new RuntimeException();
		}
		
		Object[] threadStackArr = 
		    threadStack.toArray();

		if (tr.remainingStack.length != threadStackArr.length) {
		    printError
			(ExecutionTime.UNRELATED,
			 "after executing "+
			 printArray(tr.instructions)+
			 " the contents of the stack for thread "+
			 thread.getId()+
			 " should be "+
			 printArray(tr.remainingStack)+
			 " but is "+
			 printArray(threadStackArr));
		    System.out.println(printExecution(thread));
		    printExpectedExecution(records);
		    return false;
		}

		for (int j=0; j<tr.remainingStack.length; j++) {
		    Integer elem = (Integer)threadStackArr[j];
		    if (elem == null) {
			printError
			    (ExecutionTime.UNRELATED,
			     "after executing "+
			     printArray(tr.instructions)+
			     " the stack for thread "+thread.getId()+
			     " contains a null reference");
			System.out.println(printExecution(thread));
			printExpectedExecution(records);
			return false;
		    }

		    if (!elem.equals(tr.remainingStack[j])) {
			printError
			    (ExecutionTime.UNRELATED,
			     "after executing "+
			     printArray(tr.instructions)+
			     " the contents of the stack for thread "+
			     thread.getId()+
			     " should be "+
			     printArray(tr.remainingStack)+
			     " but is "+
			     printArray(threadStackArr));
			System.out.println(printExecution(thread));
			printExpectedExecution(records);
			return false;
		    }
		}
	    }

	    cursor = result.next(cursor);
	}

	return ok_sofar;
    }

    static boolean exceptionEquals(Throwable exc1, Throwable exc2) {
	if ((exc1 == null) || (exc2 == null)) return false;
	if (exc1.equals(exc2)) return true;
	if ((exc1 instanceof ArithmeticException) &&
	    (exc2 instanceof ArithmeticException))
	    return true;
	return false;
    }

    static void printExpectedExecution(TerminationRecord[] trs) {
	System.out.println("\n========================================");
	System.out.println("Expected execution results (in termination order):\n");
	for (TerminationRecord tr : trs) {
	    System.out.print("  Thread "+tr.id);
	    System.out.print("; Code: "+printArray(tr.instructions));
	    System.out.print("; Stack: "+printArray(tr.remainingStack));
	    if (tr.exc != null)
		System.out.println("; raises exception "+tr.exc);
	    System.out.println();
	}
	System.out.println();
    }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      switch (time) {
      case AFTER:
	  System.out.println("the call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("the exception "+exc+" was raised although it "+
			     "should not have been\n");
	  break;
      }
      exc.printStackTrace();
    }

  static void printCallException(String msg, Throwable exc) {
      printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
      printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
      System.out.println("\n*** Warning for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

    static void printError(ExecutionTime time, String msg) {
      System.out.println("\n*** Error for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

  static String callSeqString(ExecutionTime time) {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      }
      return "";
  }

    static String printArray(Object[] arr) {
	StringBuilder arrString = new StringBuilder("<");

	for (int i = 0; i < arr.length; i++) {
	    arrString.append(arr[i].toString());
	    if (i < arr.length-1)
		arrString.append(" ");
	}
	arrString.append(">");
	return arrString.toString();
    }

    @SuppressWarnings("unchecked")
    public static String printExecution(Thread thread) {
	String result;
	int pc = 0;
	Instruction[] instructions = null;
	LIFO<Integer> stack = null;

	try {
	    Field 
		pcField = thread.getClass().getDeclaredField("pc");
	    pcField.setAccessible(true);
	    Field instructionsField = 
		thread.getClass().getDeclaredField("instructions");
	    instructionsField.setAccessible(true);
	    Field stackField = 
		thread.getClass().getDeclaredField("stack");
	    stackField.setAccessible(true);

	    pc = 
		(Integer) pcField.get(thread);
	    instructions = 
		(Instruction[]) instructionsField.get(thread);
	    stack = 
		(LIFO<Integer>) stackField.get(thread);
	} catch ( Throwable exc ) {
	    printCallException("access the thread fields",exc);
	    throw new RuntimeException();
	}

	result = "\nInstructions executed for thread "+thread.getId()+": "+printArray(instructions);
	result += " stack: "+printArray(stack.toArray());
	return result;
    }

}

class TerminationRecord {
    int id;
    Instruction[] instructions;
    Integer[] remainingStack;
    Exception exc;
    
    TerminationRecord(int id, Instruction[] instructions, Integer[] remainingStack, Exception exc) {
	this.id = id;
	this.instructions = instructions;
	this.remainingStack = remainingStack;
	this.exc = exc;
    }
}
