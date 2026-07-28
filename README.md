# capability-llm-infer

Atomic authority package for `llm/infer`.

- imports: `#{:llm-infer}`
- effects: `#{:data-egress :network-write :llm-inference}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
