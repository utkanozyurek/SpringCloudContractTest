package contracts

import org.springframework.cloud.contract.spec.Contract


Contract.make {
    request {
        method 'POST'
        url('/multipart')
        headers {
            contentType('multipart/form-data;boundary=AaB03x')
        }
        multipart(
                file: named(
                        name: value(consumer(regex(nonEmpty())), producer('file')),
                        content: value(consumer(regex(nonEmpty())), producer("bytes")),
                        contentType: value(consumer(regex(nonEmpty())), producer('image/png')),
                )
        )
    }
    response {
        status 200
        body([
                result: "success"
        ])
        headers {
            header('Content-Type': 'application/json')
        }
    }
}