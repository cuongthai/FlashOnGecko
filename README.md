FlashOnGecko
============

FlashOnGecko

This app demos how flash works on GeckoView based on geckoview_library and asset on March 26, 2014. 

Known bugs
- Touch on flash game buttons will hang the animation. Investigating inside firefox android source code, it seems touch events are queue and only release when there is a "pan zoom". Still havent had any solution.
- Some flash videos cause the geckoview crashes 
