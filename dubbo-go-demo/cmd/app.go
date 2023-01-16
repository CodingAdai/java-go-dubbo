package main

import (
	"context"
	"dubbo-go-app/api"
	"dubbo.apache.org/dubbo-go/v3/config"
	_ "dubbo.apache.org/dubbo-go/v3/imports"
	"log"
)

var greeterClientImpl = new(api.GreeterClientImpl)

func main() {

	config.SetConsumerService(greeterClientImpl)

	withPath := config.WithPath("conf/dubbogo.yaml")

	if err := config.Load(withPath); err != nil {
		panic(err)
	}

	req := &api.HelloRequest{
		Name: "laurence",
	}
	reply, err := greeterClientImpl.Greet(context.Background(), req)
	if err != nil {
		log.Print(err)
	}
	log.Printf("get id result: %v\n", reply.Message)
}
