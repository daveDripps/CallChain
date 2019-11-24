# CallChain
A Chain is a pattern where by objects are call in order and if one falls all previous calls are reverted, for example REST calls could be made to update several servers and if one update fails the previous, successful, calls are reverted

##implmentations

### Calling REST Endpoint in order with or without a revertsion on failure
A call chain can call a series of endpoint is sequence.  This is especially useful when the intial number of endpont to call is unknown the chain can built up through out the code and execute when desired




