## Spring Boot JWT-RSA

### Generate keypair
>1. install openssl
>2. make `certs` directory in resources
>3. open terminal and active on `certs` directory

- Commands
```shell
openssl genrsa -out keypair.pem 2048
openssl rsa -in keypair.pem -pubout -out public.pem
openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem
```