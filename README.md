# capability-llm-infer

Atomic authority package for `llm/infer`.

- imports: `#{:llm-infer}`
- effects: `#{:llm-inference}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
