# capability-llm-infer

Atomic authority package for `llm/infer`.

- imports: `#{:llm-infer}`
- effects: `#{:data-egress :network-write :llm-inference}`
- default policy: `:approval-required`
- semantic definition CID: `bafyreiaekn6d2xkw44js36amyaf27drj5tmrwuhp2pa27fddhxtjfr2t4q`
- hash contract CID: `bafkreiflhj3fslsbh7okdas2fzlhmogai64x6p3lkla6gtr7berbp7ftvi`
- provider status: `contract-only`

The repository name is a discovery alias. The semantic definition CID
is the immutable import identity. Importing it does not grant runtime
authority: Tamaki must request it explicitly and Kototama must admit
the sealed envelope.

```sh
clojure -M:test
```
