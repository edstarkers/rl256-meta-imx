require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5c3c6ce3dc672515a7ac3aa4d9f88e0b"
SRC_URI[aarch64.sha256sum] = "cd61927101107e12edfa637014c16cb53832df6d3055d9fd0fd7f8cf563739b9"
SRC_URI[arm.md5sum] = "2bdb65f38867b0b6ece575fd43959cce"
SRC_URI[arm.sha256sum] = "59e6a95700f7f184d043bed14cb931d8ebed0089a78c698c43f72383843992c9"