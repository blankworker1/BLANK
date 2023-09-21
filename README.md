# BLANK-Android

Simple android app to use [BLANK](blank.works) or [Satodime](satodime.io) cards on a smartphone. 
Verify your Bitcoin with a tap on your phone!

Using a bearer chip card that allows you to exchange Bitcoin assets like any banknote - powered by open source [Satochip](https://github.com/Toporin/SatochipApplet) technology.

Safely pass it along multiple times thanks to the secure chip in the card. Trustless, easy to verify and completly secure.

## build and dependencies

Build apk with: ```./gradlew clean build```

BLANK-Android uses two external libraries: 
* [Satochip-Java](https://github.com/Toporin/Satochip-Java) 
* [Javacryptotools](https://github.com/Toporin/Javacryptotools)

You can build these jar files  using the instructions provided in their github repo and then put these files in ```./satodime-android/libs``` folder.

## APIs

The [Javacryptotools library](https://github.com/Toporin/Javacryptotools) uses API from the following explorer services:
* [Blockstream](https://blockstream.com/)
* Sochain](https://sochain.com/)
* Fullstack](https://fullstack.cash/)
* Etherscan](https://etherscan.io/)
* Rarible](https://rarible.com/)
* Opensea](https://opensea.io/)
* Coingecko](https://www.coingecko.com/)

These APIs are used to get info such as balances, exchange rate, description and image preview.


