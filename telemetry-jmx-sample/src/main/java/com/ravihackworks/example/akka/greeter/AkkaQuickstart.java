package com.ravihackworks.example.akka.greeter;

import akka.actor.typed.ActorSystem;

import java.io.IOException;

public class AkkaQuickstart
{
  public static void main(String[] args)
  {
    final ActorSystem<GreeterMain.SayHello> myActorSystem = ActorSystem.create(GreeterMain.create(), "chandrayaan3");

    myActorSystem.tell(new GreeterMain.SayHello("ravihackworks"));

    try
    {
      System.out.println(">>> Press ENTER to exit <<<");
      System.in.read();
    }
    catch (IOException ex)
    {
      ex.printStackTrace();
    }
    finally
    {
      myActorSystem.terminate();
    }
  }
}
