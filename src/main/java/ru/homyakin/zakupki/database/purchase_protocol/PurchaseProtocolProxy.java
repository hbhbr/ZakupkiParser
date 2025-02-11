package ru.homyakin.zakupki.database.purchase_protocol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.homyakin.zakupki.models.Folder;
import ru.homyakin.zakupki.models._223fz.purchase.ProtocolCancellationType;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocol;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCAESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCZKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCCZPESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolCollationAESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolDataType;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolEvasionAESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolEvasionKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolEvasionZKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolEvasionZPESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolFCDKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolFKVOKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolOSZ;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolOSZDataType;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolPAAE;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolPAAE94FZ;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolPAEP;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolPAOA;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ1AE94FZ;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ1AESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ1KESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ1ZPESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ2AE94FZ;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ2AESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ2KESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZ2ZPESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZAE;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZOA;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZOK;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRZZKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRejectionAESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRejectionKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRejectionZKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolRejectionZPESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolSummingupAESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolSummingupKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolSummingupZKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolSummingupZPESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolVK;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolZRPZAESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolZRPZKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolZRPZZKESMBO;
import ru.homyakin.zakupki.models._223fz.purchase.PurchaseProtocolZRPZZPESMBO;

@Component
public class PurchaseProtocolProxy {
    private static Long countNotProcessed = 0L;
    private static Long countProcessed = 0L;
    private final static Logger logger = LoggerFactory.getLogger(PurchaseProtocolProxy.class);

    private final PurchaseProtocolRepository purchaseProtocolRepository;

    public PurchaseProtocolProxy(PurchaseProtocolRepository purchaseProtocolRepository) {
        this.purchaseProtocolRepository = purchaseProtocolRepository;
    }
    
    public void insert(Object parsedObject, Folder folder, String region) {
        if (parsedObject instanceof PurchaseProtocol purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolCCAESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolCCAESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolCCKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolCCKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolCCZKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolCCZKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolCCZPESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolCCZPESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolCollationAESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolCollationAESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolEvasionAESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolEvasionAESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolEvasionKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolEvasionKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolEvasionZKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolEvasionZKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolEvasionZPESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolEvasionZPESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolFCDKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolFCDKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolFKVOKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolFKVOKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolOSZ purchaseProtocolOSZ) {
            logger.error("PurchaseProtocolOSZ");
            //TODO purchaseProtocolRepository.insert(purchaseProtocolOSZ.getBody().getItem().getPurchaseProtocolOSZData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolPAAE purchaseProtocol) {
            logger.error("PurchaseProtocolPAAE");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolPAAEData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolPAAE94FZ purchaseProtocol) {
            logger.error("PurchaseProtocolPAAE94FZ");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolPAAE94FZData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolPAEP purchaseProtocol) {
            logger.error("PurchaseProtocolPAEP");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolPAEPData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolPAOA purchaseProtocol) {
            logger.error("PurchaseProtocolPAOA");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolPAOAData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolRZ1AE94FZ purchaseProtocol) {
            logger.error("PurchaseProtocolRZ1AE94FZ");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ1AE94FZData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolRZ1AESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ1AESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRZ1KESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ1KESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRZ1ZPESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ1ZPESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRZ2AE94FZ purchaseProtocol) {
            logger.error("PurchaseProtocolRZ2AE94FZ");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ2AE94FZData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolRZ2AESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ2AESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRZ2KESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ2KESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRZ2ZPESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZ2ZPESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRZAE purchaseProtocol) {
            logger.error("PurchaseProtocolRZAE");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZAEData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolRZOA purchaseProtocol) {
            logger.error("PurchaseProtocolRZOA");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZOAData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolRZOK purchaseProtocol) {
            logger.error("PurchaseProtocolRZOK");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZOKData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolRZZKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRZZKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRejectionAESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRejectionAESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRejectionKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRejectionKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRejectionZKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRejectionZKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolRejectionZPESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolRejectionZPESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolSummingupAESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolSummingupAESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolSummingupKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolSummingupKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolSummingupZKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolSummingupZKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolSummingupZPESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolSummingupZPESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolVK purchaseProtocol) {
            logger.error("PurchaseProtocolVK");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolVKData(), folder);
            countNotProcessed++;
        } else if (parsedObject instanceof PurchaseProtocolZRPZAESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolZRPZAESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolZRPZKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolZRPZKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolZRPZZKESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolZRPZZKESMBOData(), folder, region);
        } else if (parsedObject instanceof PurchaseProtocolZRPZZPESMBO purchaseProtocol) {
            purchaseProtocolRepository.insert(purchaseProtocol.getBody().getItem().getPurchaseProtocolZRPZZPESMBOData(), folder, region);
        } else if (parsedObject instanceof ProtocolCancellationType purchaseProtocol) {
            logger.error("ProtocolCancellation");
            //TODO purchaseProtocolRepository.insert(purchaseProtocol.getProtocolCancellationData(), folder, region);
            countNotProcessed++;
        } else {
            logger.error("Unknown class {}", parsedObject.getClass().getSimpleName());
        }
        countProcessed++;
        if (countProcessed % 100 == 0) {
            logger.warn("Not processed protocols {} of {}", countNotProcessed, countProcessed);
        }
    }

    private PurchaseProtocolDataType convert(PurchaseProtocolOSZDataType protocolOSZ) {
        var protocol = new PurchaseProtocolDataType();
        // PurchaseProtocolBaseDataType
        protocol.setGuid(protocol.getGuid());
        protocol.setCreateDateTime(protocolOSZ.getCreateDateTime());
        protocol.setUrlEIS(protocolOSZ.getUrlEIS());
        protocol.setUrlVSRZ(protocolOSZ.getUrlVSRZ());
        protocol.setUrlKisRmis(protocolOSZ.getUrlKisRmis());
        protocol.setPurchaseInfo(protocolOSZ.getPurchaseInfo());
        protocol.setRegistrationNumber(protocolOSZ.getRegistrationNumber());
        protocol.setPlacer(protocolOSZ.getPlacer());
        protocol.setCustomer(protocolOSZ.getCustomer());
        protocol.setAdditionalInfo(protocolOSZ.getAdditionalInfo());
        protocol.setMissedContest(protocolOSZ.isMissedContest());
        protocol.setMissedReason(protocolOSZ.getMissedReason());
        protocol.setPurchaseCancellationReason(protocolOSZ.getPurchaseCancellationReason());
        protocol.setPublicationDateTime(protocolOSZ.getPublicationDateTime());
        protocol.setStatus(protocolOSZ.getStatus());
        protocol.setVersion(protocolOSZ.getVersion());
        protocol.setModificationDescription(protocolOSZ.getModificationDescription());
        protocol.setAttachments(protocolOSZ.getAttachments());
        protocol.setAllocationReference(protocolOSZ.getAllocationReference());
        protocol.setSignatureAuthorizedBody(protocolOSZ.getSignatureAuthorizedBody());
        // PurchaseProtocolBaseDataType
        /*
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar procedureDate;
        protocol.setProcedureDate(protocolOSZ.getProcedureDate());
        protected String procedurePlace;
        protocol.setProcedurePlace(protocolOSZ.getProcedurePlace());
        protected ProtocolLotApplicationListType lotApplicationsList;
        protocol.setLotApplicationsList(protocolOSZ.getLotApplicationsList());
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar protocolSignDate;
        protected Long templateVersion;
        protected Boolean isLotOriented;
        protected PurchaseProtocolDataType.TemplateStructure templateStructure;
        protected ProtocolTemplateHideBlocks templateBlocks;
        protected ProtocolExtendFieldValueListType extendFields;
        protected String commissionNumber;
        protected String commissionName;
        protected String commissionResult;
        */
        return protocol;
    }
}
